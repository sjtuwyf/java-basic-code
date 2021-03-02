package xiancheng.tongbu;

public class Test06 {
    public static void main(String[] args) {
        Thread son = new Thread(new Son());
        son.start();
        while (true) {
            System.out.println("主线程...");
        }
    }
}
