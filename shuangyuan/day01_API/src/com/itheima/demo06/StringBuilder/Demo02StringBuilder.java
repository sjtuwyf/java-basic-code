package com.itheima.demo06.StringBuilder;

public class Demo02StringBuilder {


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder abc = builder.append("abc");
        System.out.println(builder);
        System.out.println(abc);
        System.out.println(builder == abc);

        builder.append("saf");
        builder.append(1);
        builder.append(true);
        builder.append(2.2);
        builder.append('z');
        builder.append(23);
        builder.append(1L);
        System.out.println(builder);

        System.out.println("abc".toUpperCase().toLowerCase());
        builder.append("fasd").append(3243);
        System.out.println(builder);


    }
}
