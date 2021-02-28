package cn.day06.itcast.demo03;

public class Demo04Student {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("何同学");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.isMale());
    }
}
