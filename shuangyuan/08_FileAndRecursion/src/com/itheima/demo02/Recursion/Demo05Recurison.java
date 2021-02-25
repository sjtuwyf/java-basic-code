package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo05Recurison {

    public static void main(String[] args) {
        File file = new File("D:\\File\\华生给文件\\19全栈\\01资料\\java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\19.【File类、递归】-笔记\\code");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
//                System.out.println(file);
                getAllFile(file);
            } else {
//                String name = file.getName();
//                file.getPath()
//                String string = file.toString().toLowerCase();
//                boolean b = string.endsWith(".java");
//                if(b==true){
//                    System.out.println(file);
//                }
//                System.out.println(file);
                if (file.getPath().toLowerCase().endsWith(".java") == true) {
                    System.out.println(file.getName());
                }
            }


        }
    }
}
