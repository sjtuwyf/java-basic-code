package com.itheima.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {

    public static void main(String[] args) throws IOException {
//        File file;
        FileOutputStream fos =new FileOutputStream("shuangyuan\\09_IOAndProperties\\a.txt");
        fos.write(97);
        fos.close();
    }
}
