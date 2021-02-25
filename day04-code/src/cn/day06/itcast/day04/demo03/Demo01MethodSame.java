package cn.day06.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1, 11));
    }

    public static boolean isSame(int a, int b) {
//        boolean same = a == b;

        return a == b;
    }
}
