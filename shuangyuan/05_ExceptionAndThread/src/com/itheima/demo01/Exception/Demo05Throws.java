package com.itheima.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {

    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
    }

    public static void readFile(String filename) throws IOException {
//        if(!filename.equals("c:\\a.txt")){
//            throw new FileNotFoundException("传递到文件路径不是c:\\a.txt");
//        }

        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }


        System.out.println("路径没有问题");
    }
}
