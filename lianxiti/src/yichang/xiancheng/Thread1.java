package yichang.xiancheng;

public class Thread1 extends Thread {
    @Override
    public void run() {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Integer a =i;
        }

        long end = System.currentTimeMillis();
        System.out.println("1 "+(end-start));
    }
}
