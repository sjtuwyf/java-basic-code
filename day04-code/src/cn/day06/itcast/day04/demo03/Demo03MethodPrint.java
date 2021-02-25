package cn.day06.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    public static void printCount(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!!!"+(i+1));
        }
    }
}
