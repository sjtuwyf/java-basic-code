package com.itheima.demo04.Supplier;

import java.util.function.Supplier;

public class Demo02Test {

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1, 234, 325, 132421, 241};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
