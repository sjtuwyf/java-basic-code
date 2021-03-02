package xiancheng.tongbu;

public class Tunnel implements Runnable {

    private int crossNum = 0;











    @Override
    public void run() {
        cross();
    }

    private synchronized void cross() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        crossNum++;
        System.out.println(Thread.currentThread().getName()+"   "+crossNum);
    }
}
