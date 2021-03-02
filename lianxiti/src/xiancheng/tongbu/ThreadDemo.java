package xiancheng.tongbu;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("main:"+Thread.currentThread().getName());
        SubThread subThread = new SubThread();
        subThread.start();
    }
}
