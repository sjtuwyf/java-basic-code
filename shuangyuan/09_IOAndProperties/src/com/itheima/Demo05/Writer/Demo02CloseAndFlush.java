package com.itheima.Demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("shuangyuan\\09_IOAndProperties\\e.txt");

        fw.write(97);

        fw.flush();
        fw.write(98);

        fw.close();
//        fw.write(98);
    }
}
