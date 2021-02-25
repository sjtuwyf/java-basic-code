package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("yyyy-MM-dd");
        String birthDay = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birthdayDate = sdf.parse(birthDay);

        long birthDateTime = birthdayDate.getTime();

        long todayTime = new Date().getTime();

        long time = todayTime - birthDateTime;

        System.out.println(time/1000/60/60/24);


    }
}
