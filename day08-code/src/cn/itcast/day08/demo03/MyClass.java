package cn.itcast.day08.demo03;

public class MyClass {

    int num;
    static int numStatic;

    public void method(){
        System.out.println("成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("静态成员方法");
        System.out.println(numStatic);
//        System.out.println(num);
//        System.out.println(this);
    }
}
