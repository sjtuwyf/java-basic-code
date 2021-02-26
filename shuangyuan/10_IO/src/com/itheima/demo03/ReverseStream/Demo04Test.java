package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("shuangyuan\\10_IO\\我是GBK格式的文本.txt"),"GBK");


        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("shuangyuan\\10_IO\\我是utf_8格式的文件"),"UTF-8");

        int len =0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }

        osw.close();
        isr.close();
    }
}
