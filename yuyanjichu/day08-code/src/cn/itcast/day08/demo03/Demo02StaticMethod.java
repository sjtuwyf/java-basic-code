package cn.itcast.day08.demo03;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();

        obj.methodStatic();
        MyClass.methodStatic();

        myMethod();
        Demo02StaticMethod.myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
