package threadpool.lambda;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I need a teacher.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The teacher is coming."+Thread.currentThread().getName());
        System.out.println("The teacher has gone.");
    }
}
