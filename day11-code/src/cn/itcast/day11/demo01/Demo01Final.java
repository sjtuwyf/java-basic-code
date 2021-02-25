package cn.itcast.day11.demo01;

public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);


        final int num2 = 200;
        System.out.println(num2);

//        num2 = 1;

        final int num3;
        num3 = 30;

        Student stu1  =new Student("abc");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1  =new Student("cba");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2  =new Student("absdfc");
        System.out.println(stu2.getName());
//        stu2 = new Student("abc");
        stu2.setName("asf");
        System.out.println(stu2.getName());

    }
}
