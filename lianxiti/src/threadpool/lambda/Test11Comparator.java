package threadpool.lambda;

import java.util.Arrays;

public class Test11Comparator {
    public static void main(String[] args) {
        Student[] array = {new Student("a",99),
                new Student("b",98),
                new Student("c",100)
        };

        Arrays.sort(array, (s1, s2) -> s2.getScore() - s1.getScore());

        for (Student student : array) {
            System.out.println(student);
        }
    }
}
