package com.itheima.demo06.StringBuilder;

public class Demo03StringBuilder {

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello);
        StringBuilder builder = new StringBuilder(hello);
        builder.append(" World");
        System.out.println(builder);
        String s = builder.toString();
        System.out.println(s);
    }
}
