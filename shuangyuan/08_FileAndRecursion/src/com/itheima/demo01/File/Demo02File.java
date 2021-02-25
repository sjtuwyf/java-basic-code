package com.itheima.demo01.File;

import java.io.File;

public class Demo02File {

    public static void main(String[] args) {
//        show01();
//        show02("c:\\","a.txt");
//        show02("d:\\","a.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);

    }

    private static void show02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);

    }

    private static void show01() {
        File f1 = new File("c:\\Users\\itcast\\shuang\\a.txt");
        System.out.println(f1);
        File f2 = new File("c:\\Users\\itcast\\shuang");
        System.out.println(f2);
        File f3 = new File("b.txt");
        System.out.println(f3);

    }
}
