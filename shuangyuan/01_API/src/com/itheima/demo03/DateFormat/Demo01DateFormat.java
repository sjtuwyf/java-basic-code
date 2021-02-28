package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();

    }
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat();
        Date date=sdf.parse("2021/2/22 下午4:36");
        System.out.println(date);
    }



    private static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }

}
