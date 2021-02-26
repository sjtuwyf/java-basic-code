package com.itheima.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("控制台输出");

        PrintStream ps = new PrintStream("shuangyuan\\10_IO\\目的地.txt");
        System.setOut(ps);
        System.out.println("目的地");
        ps.close();
    }
}
