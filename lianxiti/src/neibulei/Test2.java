package neibulei;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("小红");
        Student s2 = new Student("小亮");
        Student s3 = new Student("小明");

        ArrayList<Student> sList = new ArrayList<>();
        sList.add(s);
        sList.add(s2);
        sList.add(s3);

        Teacher t = new Teacher("张老师");
        Course course = new Course("Java", t, sList);

        t.dianMing(sList);

        course.show();
    }
}
