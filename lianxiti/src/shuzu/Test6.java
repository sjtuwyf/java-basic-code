package shuzu;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(sym(arr));
        int[] arr2 = {1, 2, 3, 6, 4, 5, 5};
        System.out.println(sym(arr2));
    }

    public static boolean sym(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length - 1 - i) {
                break;
            }
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;

    }
}
