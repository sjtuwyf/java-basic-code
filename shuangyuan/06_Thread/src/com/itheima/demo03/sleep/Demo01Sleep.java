package com.itheima.demo03.sleep;

public class Demo01Sleep {

    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
