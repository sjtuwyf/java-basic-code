package com.itheima.demo01.Object;

import java.util.ArrayList;

public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("a",18);
        Person p2 = new Person("a",18);
        System.out.println(p1);
        System.out.println(p2);

//        p1 =p2;
//        System.out.println(p1);
//        System.out.println(p2);
        System.out.println(p1.equals(p2));


        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(p1);
        System.out.println(b);
    }
}
