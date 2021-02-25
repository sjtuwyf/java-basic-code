package com.itheima.demo03.Lambda;

public class Demo01Runnable {

    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();

        Thread t =new Thread(run);

        t.start();



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        };
        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();

    }
}
