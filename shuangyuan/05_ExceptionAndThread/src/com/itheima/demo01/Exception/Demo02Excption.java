package com.itheima.demo01.Exception;

public class Demo02Excption {

    public static void main(String[] args) {

        int[] arr= {1,2,3};
        int e = getElement(arr, 3);
        System.out.println(e);

    }

    public static int getElement(int[] arr,int index){
        int i = arr[index];
        return i;
    }
}
