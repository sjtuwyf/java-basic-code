package com.itheima.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("abc");
        PrintStream ps = new PrintStream("shuangyuan\\10_IO\\print.txt");
        ps.write(97);
        ps.print(97);
        ps.println(6.7);
        ps.println(97.456);
        ps.println(true);
        ps.println(97);
        ps.println(97);
        ps.println(97);

        ps.close();



    }
}
