package xiancheng.tongbu;

public class Test07 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("播放音乐");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("显示画面");
                }
            }
        }).start();
    }
}
