package cn.day06.itcast.day05.demo01;

public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int temp;
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length - 1 - i) {
                break;
            }
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int min=0,max=array.length-1;min<max;min++,max--){
            int temp = array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
