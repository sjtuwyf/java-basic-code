package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
        Collections.addAll(list,"g","h");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
