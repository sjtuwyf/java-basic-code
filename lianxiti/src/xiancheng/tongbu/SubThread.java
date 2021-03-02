package xiancheng.tongbu;

public class SubThread extends Thread {
    @Override
    public void run() {

        System.out.println("subThread" + Thread.currentThread().getName());
    }
}
