package com.itheima.demo02.CopyFile;

import java.io.*;

public class Demo02CopyFile {

    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
//        FileInputStream fis = new FileInputStream("shuangyuan\\10_IO\\abc.png");
//
//        FileOutputStream fos = new FileOutputStream("shuangyuan\\10_IO\\abc3.png");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("shuangyuan\\10_IO\\abc.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("shuangyuan\\10_IO\\abc3.png"));




        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }

//        while ((len=bis.read())!=-1){
//            bos.write(len);
//        }


        bos.close();
        bis.close();

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

    }
}
