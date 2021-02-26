package com.itheima.Demo05.Writer;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("shuangyuan\\09_IOAndProperties\\d.txt");

        fw.write(97);

        fw.flush();

        fw.close();
    }
}
