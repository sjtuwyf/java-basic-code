package com.itheima.demo03.ReverseStream;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {

    public static void main(String[] args) throws IOException {
//        read_utf_8();
        read_gbk();

    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("shuangyuan\\10_IO\\GBK.txt"), "GBK");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("shuangyuan\\10_IO\\utf_8.txt"), "UTF-8");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
