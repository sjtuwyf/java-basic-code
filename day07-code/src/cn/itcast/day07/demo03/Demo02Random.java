package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
