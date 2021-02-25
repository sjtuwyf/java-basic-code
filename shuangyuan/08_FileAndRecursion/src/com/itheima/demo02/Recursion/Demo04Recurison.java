package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProjects\\basic-code\\5");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
//                System.out.println(file);
                getAllFile(file);
            } else {
                System.out.println(file);
            }



        }
    }

}
