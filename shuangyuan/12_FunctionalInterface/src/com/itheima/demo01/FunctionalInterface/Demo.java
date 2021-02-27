package com.itheima.demo01.FunctionalInterface;
/*
    函数式接口的使用:一般可以作为方法的参数和返回值类型
 */
public class Demo {
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("abc");
            }
        });

        show(()-> System.out.println("xyz"));
    }
}
