package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};

        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 ={1,3,5,7,2};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"seaf","safa","geragea"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
