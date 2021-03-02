package xiancheng.tongbu;

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Runnable:"+ Thread.currentThread().getName());
        SubRunnable subRunnable = new SubRunnable();
        Thread thread = new Thread(subRunnable);
        thread.start();
    }
}
