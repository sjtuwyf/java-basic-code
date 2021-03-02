package threadpool.lambda;

public class Test06 {
    public int start = 1;
    private int end = 99;

    public static void main(String[] args) {
        new Test06().method();
    }

    private void method() {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (; start <= end; start++) {
//                    System.out.println(start);
//                }
//            }
//        });
        Runnable a = () -> {
            for (; start <= end; start++) {
                System.out.println(start);
            }
        };
        Thread thread = new Thread(a);
        thread.start();

    }


}
