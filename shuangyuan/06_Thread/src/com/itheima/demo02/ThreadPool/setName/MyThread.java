package com.itheima.demo02.ThreadPool.setName;

public class MyThread extends Thread {


    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
//        super.run();
        System.out.println(Thread.currentThread().getName());


    }
}
