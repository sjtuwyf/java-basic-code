package com.itheima.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("shuangyuan\\10_IO\\list.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("shuangyuan\\10_IO\\list.txt"));
        Object o = ois.readObject();

        ArrayList<Person> list2 = (ArrayList<Person>) o;
        for (Person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
