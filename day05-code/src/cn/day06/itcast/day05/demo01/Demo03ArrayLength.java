package cn.day06.itcast.day05.demo01;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[6];

        int[] arrayB = {1,2,3,4,4,5,5,5,6,3,4,3,43};
        int len = arrayB.length;
        System.out.println(len);

        int[] arrayC = new int[6];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
