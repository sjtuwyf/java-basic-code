package com.itheima.demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {

    public static void main(String[] args) throws IOException {
//        File file;
        FileInputStream fis = new FileInputStream("shuangyuan\\09_IOAndProperties\\a.txt");
//        int len = fis.read();
//        System.out.println(len);

//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);

        int len = 0;

        while ((len = fis.read())!=-1){
            System.out.print((char) len);
        }


        fis.close();
    }
}
