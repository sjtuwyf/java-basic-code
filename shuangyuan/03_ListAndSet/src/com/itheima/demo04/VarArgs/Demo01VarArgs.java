package com.itheima.demo04.VarArgs;

public class Demo01VarArgs {


    public static void main(String[] args) {
        System.out.println(add());
    }


    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
