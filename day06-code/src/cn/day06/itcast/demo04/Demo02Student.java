package cn.day06.itcast.demo04;

public class Demo02Student {
    public static void main(String[] args) {

        Student stu1 = new Student("张三",18);
        Student stu2 = new Student();

        System.out.println(stu1.getName()+stu1.getAge());
        System.out.println(stu2.getName()+stu2.getAge());
    }
}
