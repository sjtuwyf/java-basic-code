package com.itheima.demo01.File;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        File file = new File("D:\\IdeaProjects\\basic-code\\5");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }


    private static void show01() {
        File file = new File("D:\\IdeaProjects\\basic-code\\5");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
