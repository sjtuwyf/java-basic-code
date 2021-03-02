package xiancheng.tongbu;

public class TunnelDemo {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(tunnel, "p" + i);


            thread.start();
        }
    }
}
