package com.itheima.demo01.Object;

import java.util.Objects;

public class Demo03Objects {

    public static void main(String[] args) {
        String s1 = null;
//        String s1 = "abc";
        String s2 = "abc";

//        boolean b = s1.equals(s2);
//        System.out.println(b);
        boolean b1= Objects.equals(s1,s2);
        System.out.println(b1);


    }
}
