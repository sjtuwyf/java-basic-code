package cn.day06.itcast.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=================");

        stu.name = "特朗普";
        stu.age = 70;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=================");

        stu.eat();
        stu.sleep();
        stu.study();

    }
}
