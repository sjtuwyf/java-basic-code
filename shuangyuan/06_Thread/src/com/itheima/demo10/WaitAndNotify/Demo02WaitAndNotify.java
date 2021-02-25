package com.itheima.demo10.WaitAndNotify;

public class Demo02WaitAndNotify {


    public static void main(String[] args) {


        Object obj =new Object();
        new Thread(){
            @Override
            public void run() {

                while (true){
                    synchronized (obj){
                        System.out.println("1 tell cooker");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("1 eat it");


                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {

                while (true){
                    synchronized (obj){
                        System.out.println("2 tell cooker");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("2 eat it");


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
                        obj.notifyAll();

                    }
                }
            }
        }.start();


    }
}
