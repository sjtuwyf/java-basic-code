package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

public class Demo05File  {

    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
//        x(1,2);
    }

    private static void show03() {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\5\\1\\22");
        boolean delete = f1.delete();
        System.out.println(delete);

        File f2 = new File("D:\\IdeaProjects\\basic-code\\5\\1.txt");
        boolean delete1 = f2.delete();
        System.out.println(delete1);
    }

//    private static void x(int a ,int b) {
//
//    }



    private static void show02() {

        File f1 = new File("D:\\IdeaProjects\\basic-code\\5\\x");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

        File f2 = new File("D:\\IdeaProjects\\basic-code\\5\\1\\22\\333");
        boolean mkdirs = f2.mkdirs();
        System.out.println(mkdirs);

        File f3 = new File("D:\\IdeaProjects\\basic-code\\5\\1.txt");
        boolean mkdirs1 = f3.mkdirs();
        System.out.println(mkdirs1);

        File f4 = new File("5\\1");
        boolean mkdirs2 = f4.mkdirs();
        System.out.println(mkdirs2);
    }

    private static void show01() throws IOException {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\5\\x.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
        File f2 = new File("5\\y.txt");
        System.out.println(f2.createNewFile());
        File f3 = new File("5\\y");
        System.out.println(f3.createNewFile());
        File f4 = new File("6\\y.txt");
        System.out.println(f4.createNewFile());
    }
}
