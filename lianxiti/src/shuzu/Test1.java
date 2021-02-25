package shuzu;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {1, 4, 576, 23, 43, 54, 75, 23};
        printNum(array);
    }

    public static void printNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
