package com.itheima.demo07.Prop;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {

    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("shuangyuan\\09_IOAndProperties\\prop.txt"));
//        prop.load(new FileInputStream("shuangyuan\\09_IOAndProperties\\prop.txt"));

        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String property = prop.getProperty(s);
            System.out.println(s+property);
        }


    }

    private static void show02() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("zly啥都", "168");
        prop.setProperty("glnz", "168");
        prop.setProperty("dlrb", "168");

//        FileWriter fw = new FileWriter("shuangyuan\\09_IOAndProperties\\prop.txt");
//
//        prop.store(fw,"save data");
//        fw.close();

        prop.store(new FileOutputStream("shuangyuan\\09_IOAndProperties\\prop2.txt"),"");
    }

    private static void show01() {

        Properties prop = new Properties();

        prop.setProperty("zly", "168");
        prop.setProperty("glnz", "168");
        prop.setProperty("dlrb", "168");

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + value);
        }

    }
}
