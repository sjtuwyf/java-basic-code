package cn.day06.itcast.day04.demo04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        System.out.println(isSame(a, b));

        System.out.println(isSame((short) 20, (short) 21));

        System.out.println(isSame(12, 12));

        System.out.println(isSame(13L, 13L));
    }

    public static boolean isSame(byte a, byte b) {
        boolean same;
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        boolean same;
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        boolean same;
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        boolean same;
        return a == b;
    }

}
