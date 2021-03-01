package yichang.xiancheng;

public class Thread2 extends Thread {
    @Override
    public void run() {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String b = "黑马程序员";
        }
        long end = System.currentTimeMillis();
        System.out.println("2 "+(end-start));
    }
}
