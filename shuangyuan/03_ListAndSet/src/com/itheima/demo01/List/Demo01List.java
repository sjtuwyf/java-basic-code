package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List
{

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        System.out.println(list);

        list.add(3,"itheima");

        System.out.println(list);

        String remoeE = list.remove(2);
        System.out.println(remoeE);
        System.out.println(list);

        String setE = list.set(4, "A");
        System.out.println(setE);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : list) {
            System.out.println(s);
        }

//        System.out.println(list.get(5));


    }
}
