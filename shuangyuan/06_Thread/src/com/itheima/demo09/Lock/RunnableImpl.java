package com.itheima.demo09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

    private static int ticket = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        System.out.println("this"+this);

        while (true){

            l.lock();

            if(ticket>0){

                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+" "+ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    l.unlock();
                }




            }




        }

    }

//    @Override
//    public void run() {
//        System.out.println("this"+this);
//
//        while (true){
//
//            l.lock();
//
//            if(ticket>0){
//
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println(Thread.currentThread().getName()+" "+ticket);
//                ticket--;
//
//
//            }
//            l.unlock();
//
//
//
//        }
//
//    }


    public static /*synchronized*/ void payTicketStatic(){

        synchronized (RunnableImpl.class){

            if(ticket>0){

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" "+ticket);
                ticket--;


            }

        }


    }

    public /*synchronized*/ void payTicket(){

        synchronized (this){

            if(ticket>0){

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" "+ticket);
                ticket--;


            }

        }


    }
}
