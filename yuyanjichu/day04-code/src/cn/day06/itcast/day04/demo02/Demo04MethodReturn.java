package cn.day06.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println(num);

        printSum(100, 200);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
