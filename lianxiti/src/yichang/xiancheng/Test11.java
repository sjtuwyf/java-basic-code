package yichang.xiancheng;

public class Test11 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
