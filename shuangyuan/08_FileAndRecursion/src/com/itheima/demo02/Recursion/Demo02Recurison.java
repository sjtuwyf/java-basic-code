package com.itheima.demo02.Recursion;

public class Demo02Recurison {

    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);

    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);
    }
}
