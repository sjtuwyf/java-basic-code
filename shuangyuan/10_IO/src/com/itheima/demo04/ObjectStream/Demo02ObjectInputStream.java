package com.itheima.demo04.ObjectStream;

import java.io.*;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("shuangyuan\\10_IO\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p.getName()+p.getAge());
    }
}
