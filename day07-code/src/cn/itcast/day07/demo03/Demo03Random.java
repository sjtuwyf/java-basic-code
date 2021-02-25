package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(1 + r.nextInt(5));
        int num = 5;


        System.out.println("=======");
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(num) + 1;
            System.out.println(result);
        }

    }
}
