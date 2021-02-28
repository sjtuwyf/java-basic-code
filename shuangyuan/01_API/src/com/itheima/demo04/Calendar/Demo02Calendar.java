package com.itheima.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();

    }

    private static void demo04() {

        Calendar c = Calendar.getInstance();

        Date date1 = c.getTime();
        System.out.println(date1);


        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);




    }

    private static void demo03() {

        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-3);
        c.add(Calendar.DATE,2);





        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);




    }

    private static void demo02() {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DATE,9);

        c.set(3454,4,4);
        c.set(234,234,243);


        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);



    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }
}
