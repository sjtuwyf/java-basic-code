package list.set;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        Studentt[] stu = {new Studentt("a",20,90.0f),
                new Studentt("b",22,90.0f),
                new Studentt("c",20,99.0f),
                new Studentt("d",20,100.0f)};

        Arrays.sort(stu,new StudenttComparactor());

        for (Studentt studentt : stu) {
            System.out.println(studentt);
        }




    }
}
