package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {

    public static void main(String[] args) {
        File file = new File("D:\\File\\华生给文件\\19全栈\\01资料\\java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\19.【File类、递归】-笔记\\code");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
//        System.out.println(dir.getName());
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory()||pathname.getPath().toLowerCase().endsWith(".java");
//            }
//        });
//        File[] files = dir.listFiles((File pathname)->{return pathname.isDirectory()||pathname.getPath().toLowerCase().endsWith(".java");});

        File[] files = dir.listFiles(pathname->pathname.isDirectory()||pathname.getPath().toLowerCase().endsWith(".java"));


//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//            }
//        });

//        File[] files = dir.listFiles((File d, String name)->{
//            return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//        });

//        File[] files = dir.listFiles((d, name)-> new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java"));


        for (File file : files) {
            if(file.isDirectory()){
//                System.out.println(file);
                getAllFile(file);
            } else {
                System.out.println(file.getName());
            }



        }
    }
}
