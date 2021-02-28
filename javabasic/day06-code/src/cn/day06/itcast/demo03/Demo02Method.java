package cn.day06.itcast.demo03;

public class Demo02Method {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getMax(array));

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
