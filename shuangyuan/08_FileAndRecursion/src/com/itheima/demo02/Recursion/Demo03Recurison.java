package com.itheima.demo02.Recursion;

public class Demo03Recurison
{
    public static void main(String[] args) {
        System.out.println(jc(6));
    }

    public static int jc(int n){
        if (n==1){
            return 1;
        }
        return n*jc(n-1);
    }

}
