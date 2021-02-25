package com.itheima.demo03.Lambda;

public class Demo02Lambda {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();

        new Thread(() ->{
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        ).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+"新的线程创建了")

        ).start();
    }
}
