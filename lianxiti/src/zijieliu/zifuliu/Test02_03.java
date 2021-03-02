package zijieliu.zifuliu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test02_03 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            int i1 = scanner.nextInt();
            System.out.println(i);
            int i2 = scanner.nextInt();
            System.out.println(i);
            String name = scanner.next();
            System.out.println(i);
            String sex = scanner.next();
            Student student = new Student(i1, i2, name, sex);
            list.add(student);
        }

        FileWriter fileWriter = new FileWriter("lianxiti/file/Student.txt");

        for (Student student : list) {
            String s = student.getNum() + "," + student.getAge() + "," + student.getName() + ","
                    + student.getSex();
            fileWriter.write(s);
            fileWriter.write(System.lineSeparator());

        }

        fileWriter.close();
    }
}
