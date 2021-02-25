package com.itheima.demo10.WaitAndNotify;

public class Demo01WaitAndNotify {


    public static void main(String[] args) {
        Object obj =new Object();
        new Thread(){
            @Override
            public void run() {

                while (true){
                    synchronized (obj){
                        System.out.println("tell cooker");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("eat it");


                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj){
                        System.out.println("tell eater");
                        obj.notify();

                    }
                }
            }
        }.start();











    }
}
