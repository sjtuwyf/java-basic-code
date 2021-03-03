package hanshusijiekou.fangfayinyong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("a",97));
        students.add(new Student("b",94));
        students.add(new Student("c",96));
        students.add(new Student("d",96));
        students.add(new Student("e",98));

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getScore()-o2.getScore();
//            }
//        });

//        Collections.sort(students,(o1,o2)->o1.getScore()-o2.getScore());

        Collections.sort(students, Comparator.comparingInt(Student::getScore));
        System.out.println(students);





    }
}
