package com.itheima.demo02.ThreadPool.Exception;

import java.io.IOException;

public class Demo02TryCatchFinally {

    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("资源释放");
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
