package com.itheima.demo03.ReverseStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {

    public static void main(String[] args) throws IOException {
//        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("shuangyuan\\10_IO\\GBK.txt"),"GBK");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    private static void write_utf_8() throws IOException {
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("shuangyuan\\10_IO\\utf_8.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("shuangyuan\\10_IO\\utf_8.txt"));
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
