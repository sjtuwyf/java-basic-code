package com.itheima.demo04.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {


    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("shuangyuan\\10_IO\\person.txt"));
        Person p = new Person("小美女", 18);
//        p.setAge(18);
//        System.out.println(p);

        oos.writeObject(new Person("小美女",18));
//        oos.writeObject(p);
        oos.close();
    }
}
