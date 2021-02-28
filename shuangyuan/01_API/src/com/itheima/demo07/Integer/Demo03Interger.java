package com.itheima.demo07.Integer;

public class Demo03Interger {

    public static void main(String[] args) {

        int i1=100;
        String s1 = i1+"";
        System.out.println(s1);

        String s2 = Integer.toString(i1);
        System.out.println(s2);

        String s3 = String.valueOf(s1);
        System.out.println(s3);

        int i = Integer.parseInt(s1);
        System.out.println(i-10);



    }
}
