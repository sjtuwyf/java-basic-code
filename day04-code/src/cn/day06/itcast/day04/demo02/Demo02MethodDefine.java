package cn.day06.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,20));

        int number = sum(11,12);
        System.out.println(number);

    }

    public static int sum(int a, int b) {
        System.out.println("ok");
        int result = a + b;
        return result;
    }
}
