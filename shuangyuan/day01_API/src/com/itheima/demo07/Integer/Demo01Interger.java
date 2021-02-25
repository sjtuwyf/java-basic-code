package com.itheima.demo07.Integer;

public class Demo01Interger {

    public static void main(String[] args) {

        Integer int1 = new Integer(1);
        System.out.println(int1);

        Integer integer = new Integer("1");
        System.out.println(integer);

        Integer integer1 = Integer.valueOf(1);
        System.out.println(integer1);

        Integer integer2 = Integer.valueOf("1");
        System.out.println(integer2);

        int i = int1.intValue();
        System.out.println(i);

    }
}
