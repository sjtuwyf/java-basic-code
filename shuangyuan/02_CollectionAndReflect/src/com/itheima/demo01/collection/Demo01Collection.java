package com.itheima.demo01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo01Collection {

    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);

        boolean b1 = coll.add("few");
        System.out.println(b1);
        System.out.println(coll);
        coll.add("waefa");
        coll.add("waefa");
        coll.add("waefa");
        coll.add("waefa");
        System.out.println(coll);

        boolean b2 = coll.remove("few");
        System.out.println(b2);
        boolean b3 = coll.remove("sfadsafsadf");
        System.out.println(b3);
        System.out.println(coll);

        boolean b4 = coll.contains("waefa");
        System.out.println(b4);
        boolean b5 = coll.contains("eadfasfsa");
        System.out.println(b5);

        boolean b6 = coll.isEmpty();
        System.out.println(b6);

        int size = coll.size();
        System.out.println(size);

        Object[] array = coll.toArray();
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());


    }
}
