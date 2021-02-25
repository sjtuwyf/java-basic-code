package com.itheima.demo01.File;

import java.io.File;

public class Demo03File {

    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();

    }

    private static void show04() {
        File file1 = new File("D:\\File\\wenjian\\zhaopian");
        long length = file1.length();
        System.out.println(length);

        File file2 = new File("D:\\File\\wenjian\\zhaopian\\IMG_3993");
        long length2 = file2.length();
        System.out.println(length2);
    }

    private static void show03() {
        File file1 = new File("c:\\Usrs\\a.txt");
        String absolutePath1 = file1.getName();
        System.out.println(absolutePath1);
//        System.out.println(file1.toString());

        File file = new File("c:\\Usrs");
        String absolutePath = file.getName();
        System.out.println(absolutePath);

//        System.out.println(file.toString());
    }

    private static void show02() {
        File file1 = new File("c:\\Usrs\\a.txt");
        String absolutePath1 = file1.getPath();
        System.out.println(absolutePath1);
        System.out.println(file1.toString());

        File file = new File("a.txt");
        String absolutePath = file.getPath();
        System.out.println(absolutePath);

        System.out.println(file.toString());
    }

    private static void show01() {
        File file1 = new File("c:\\Usrs\\a.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);

        File file = new File("a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
    }
}
