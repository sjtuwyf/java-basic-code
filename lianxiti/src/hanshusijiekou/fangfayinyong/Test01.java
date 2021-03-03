package hanshusijiekou.fangfayinyong;

public class Test01 {
    public static void main(String[] args) {
        showCurrentTime(()-> System.out.println(System.currentTimeMillis()));
    }

    public static void showCurrentTime(CurrentTimePrinter currentTimePrinter) {
        currentTimePrinter.printCurrentTime();
    }
}
