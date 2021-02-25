package com.itheima.demo03.Generic;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

    public static void main(String[] args) {
//        demo01();

        demo02();
    }

    private static void demo02() {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
//        list.add(1);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String a = it.next();
            System.out.println(a + a.length());
        }

    }

    private static void demo01() {

        ArrayList<Object> list = new ArrayList<>();
        list.add("abc");
        list.add(1);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

            String s = (String) obj;
            System.out.println(s.length());

        }
    }
}
