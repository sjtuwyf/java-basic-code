package com.itheima.demo01.List;

import java.util.LinkedList;

public class Demo02LinkedList {

    public static void main(String[] args) {
        show01();

        show02();

        show03();

    }

    private static void show03() {

        LinkedList<String> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.println(linked);

//        String s = linked.removeFirst();
        String s = linked.pop();
        System.out.println(s);
        System.out.println(linked);
        String s1 = linked.removeLast();
        System.out.println(s1);
        System.out.println(linked);


    }

    private static void show02() {

        LinkedList<String> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");

        linked.clear();
        System.out.println(linked);


        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }



    }

    private static void show01() {

        LinkedList<String> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.println(linked);

//        linked.addFirst("www");
        linked.push("www");

        System.out.println(linked);

        linked.addLast("com");

        System.out.println(linked);






    }
}
