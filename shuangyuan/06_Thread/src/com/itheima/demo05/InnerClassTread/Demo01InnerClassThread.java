package com.itheima.demo05.InnerClassTread;

public class Demo01InnerClassThread {

    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "a");
                }
            }
        }.start();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "b");
                }
            }
        };

        new Thread(r).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "c");
                }
            }
        }).start();


    }
}
