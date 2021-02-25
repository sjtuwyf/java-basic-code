package com.itheima.demo02.ThreadPool.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("abc");
        mt.start();

        MyThread cba = new MyThread("cba");
        cba.start();


    }
}
