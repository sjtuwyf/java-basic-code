package com.itheima.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("shuangyuan\\09_IOAndProperties\\orange.jpg");
        FileOutputStream fos = new FileOutputStream("shuangyuan\\09_IOAndProperties\\newOrange5.jpg");

        try (fis;fos){
            int len = 0;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
        } catch (IOException e){
            System.out.println(e);
        }




    }

}
