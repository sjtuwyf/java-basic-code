package cn.day06.itcast.day05.demo01;

public class Demo05Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 65, 999757};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
