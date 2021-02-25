package com.itheima.demo02.ThreadPool.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02Foreach {

    public static void main(String[] args) {
        demo01();

        demo02();
    }

    private static void demo02() {

        ArrayList<String> list = new ArrayList<>();
        list.add("sfad");
        list.add("sfad");
        list.add("sfad");
        list.add("sfad");
        list.add("sfad");

        for (String s : list) {
            System.out.println(s);
        }


    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
