package com.itheima.demo02.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("shuangyuan\\10_IO\\abc.png");

        FileOutputStream fos = new FileOutputStream("shuangyuan\\10_IO\\abc2.png");



        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes);
        }

//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }


        fos.close();
        fis.close();

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

    }
}
