package com.itheima.demo02.ThreadPool.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {

    public static void main(String[] args) {


        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("23r223r");
        set.add("ab223r");
        set.add("1");
        set.add("3");
        set.add("2");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("abc");
        linked.add("abc");
        linked.add("www");
        linked.add("23r223r");
        linked.add("ab223r");
        linked.add("1");
        linked.add("3");
        linked.add("2");
        System.out.println(linked);
    }
}
