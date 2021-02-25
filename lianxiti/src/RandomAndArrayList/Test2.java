package RandomAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            System.out.println("输入1继续，0退出");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    inputStu(students,scanner);
                    break;
                case 0:
                    System.out.println("输入完毕");
                    break;
            }
            if (i==0){
                break;
            }
        }
        for (Student student : students) {
            student.show();
        }

    }

    private static void inputStu(ArrayList<Student> list,Scanner scanner){
        System.out.println("输入姓名");
        String name = scanner.next();
        System.out.println("输入年龄");
        int age = scanner.nextInt();
        list.add(new Student(name,age));
    }
}
