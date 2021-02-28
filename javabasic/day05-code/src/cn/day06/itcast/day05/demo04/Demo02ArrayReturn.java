package cn.day06.itcast.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculata(10, 20, 30);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result);
    }

    public static int[] calculata(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        System.out.println(array);
        return array;
    }
}
