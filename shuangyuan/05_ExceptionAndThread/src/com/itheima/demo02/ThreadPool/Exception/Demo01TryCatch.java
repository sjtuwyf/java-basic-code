package com.itheima.demo02.ThreadPool.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01TryCatch {

    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
            System.out.println("资源释放");
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("catch-后缀不是.txt");
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());

//            System.out.println(e);

        }
        System.out.println("后续代码");
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
