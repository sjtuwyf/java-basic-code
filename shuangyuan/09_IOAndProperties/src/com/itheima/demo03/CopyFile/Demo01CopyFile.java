package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("shuangyuan\\09_IOAndProperties\\orange.jpg");

        FileOutputStream fos = new FileOutputStream("shuangyuan\\09_IOAndProperties\\newOrange2.jpg");

        byte[] bytes = new byte[1024];

        int len = 0;

//        while ((len = fis.read(bytes)) != -1) {
//            fos.write(bytes);
//        }

        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

    }
}
