package com.itheima.demo03.Generic;

public class Demo02Generic {

    public static void main(String[] args) {

        GenericClass gc = new GenericClass();
        gc.setName("sfad");

//        String name = gc.getName();
//        System.out.println(name);

        GenericClass<Integer> gc2 = new GenericClass<Integer>();
        gc2.setName(1);

        System.out.println(gc2.getName());

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("fsadf");
        System.out.println(gc3.getName());

    }
}
