package com.itheima.demo01.File;

import java.io.File;

public class Demo04File {

    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {

        File f1 = new File("D:\\IdeaProjects\\basic");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        File f2 = new File("D:\\IdeaProjects\\basic-code");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
        File f3 = new File("D:\\IdeaProjects\\basic-code\\5\\5.iml");
        if(f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }

    }

    private static void show01() {
        File f1 = new File("D:\\IdeaProjects\\basic-code");
        System.out.println(f1.exists());

        File f2 = new File("D:\\IdeaProjects\\basic");
        System.out.println(f2.exists());

        File f3 = new File("5");
        System.out.println(f3.exists());

        File f4 = new File("basic-code");
        System.out.println(f4.exists());
    }
}
