package com.itheima.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        File file;
        FileOutputStream fos = new FileOutputStream("shuangyuan\\09_IOAndProperties\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }       

        fos.close();
    }
}
