package yichang.xiancheng;

public class Thread3  extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String c = "黑马程序员"+i;

        }

        long end = System.currentTimeMillis();
        System.out.println("3 "+(end-start));
    }
}
