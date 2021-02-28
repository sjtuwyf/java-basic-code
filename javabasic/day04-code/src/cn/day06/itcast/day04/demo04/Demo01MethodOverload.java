package cn.day06.itcast.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(double a, double b) {
        return (int  ) (a + b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
