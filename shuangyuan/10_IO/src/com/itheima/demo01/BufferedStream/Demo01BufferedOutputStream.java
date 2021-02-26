package com.itheima.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("shuangyuan\\10_IO\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("写入缓冲区".getBytes());

        bos.flush();

        bos.close();
    }
}
