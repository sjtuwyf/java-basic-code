package com.itheima.demo08.Synchronized;

public class RunnableImpl implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        System.out.println("this"+this);

        while (true){



            payTicketStatic();


        }

    }


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
