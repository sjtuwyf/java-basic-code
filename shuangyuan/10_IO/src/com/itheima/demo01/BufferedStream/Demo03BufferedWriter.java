package com.itheima.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("shuangyuan\\10_IO\\c.txt"));

        for (int i = 0; i < 100; i++) {
            bw.write("法术ds");
//            bw.write("\r\n");
            bw.newLine();
        }


        bw.flush();

        bw.close();
    }
}
