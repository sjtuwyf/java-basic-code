package com.itheima.demo01.Exception;

public class Demo03Throw {

    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {

        if (arr == null) {
            throw new NullPointerException("传递的数组的值是null");
        }

        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("索引值异常");
        }

        int ele = arr[index];
        return ele;
    }


}
