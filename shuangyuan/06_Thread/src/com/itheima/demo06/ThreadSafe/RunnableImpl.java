package com.itheima.demo06.ThreadSafe;

public class RunnableImpl implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {

        while (true){
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
