package com.itheima.demo04.Runnable;

public class Demo01Runnable {

    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();
//        Thread t = new Thread(run);
        Thread t = new Thread(new RunnableImpl2());
        t.start();


        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}
