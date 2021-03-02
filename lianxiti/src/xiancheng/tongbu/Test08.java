package xiancheng.tongbu;

public class Test08 extends Thread {
    int a =1;

    public static void main(String[] args) {

        Test08 thread = new Test08();
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }

    }

    @Override
    public void run() {
        for (; a < 20; a++) {
            System.out.println(Thread.currentThread().getName()+"  "+a);
            
        }
    }
}
