package xiancheng.tongbu;

public class Son implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("子线程...");
        }
    }
}
