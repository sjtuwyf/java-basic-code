package xiancheng.tongbu;

public class SubRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("SubRunnable"+Thread.currentThread().getName());
    }
}
