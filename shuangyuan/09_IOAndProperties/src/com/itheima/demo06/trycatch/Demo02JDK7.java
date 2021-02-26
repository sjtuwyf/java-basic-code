package com.itheima.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02JDK7 {
    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("shuangyuan\\09_IOAndProperties\\orange.jpg");

             FileOutputStream fos = new FileOutputStream("shuangyuan\\09_IOAndProperties\\newOrange3.jpg");){

            byte[] bytes = new byte[1024];

            int len = 0;

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }

        } catch (IOException e){

            System.out.println(e);
        }






    }


}
