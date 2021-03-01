package list.set;

import java.util.Arrays;

public class ComparableTest {

    public static void main(String[] args) {

        Student[] stu = {new Student("a",20,90.0f),
                new Student("b",22,90.0f),
                new Student("c",20,99.0f),
                new Student("d",20,100.0f)
        };

        Arrays.sort(stu);
        for (Student student : stu) {
            System.out.println(student);
        }
    }

}
