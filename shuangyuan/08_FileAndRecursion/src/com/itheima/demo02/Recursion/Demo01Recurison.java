package com.itheima.demo02.Recursion;

public class Demo01Recurison  {
    public static void main(String[] args) {
//        a();
        b(1);
    }

//    public Demo01Recurison() {
//        Demo01Recurison();
//    }

    private static void b(int i) {
        System.out.println(i);
        if(i==10000){
            return;

        }
        b(++i);

    }

    private static void a() {
        System.out.println("aaa");
        a();
    }
}
