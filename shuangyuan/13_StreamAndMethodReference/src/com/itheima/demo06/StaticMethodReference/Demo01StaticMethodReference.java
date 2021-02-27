package com.itheima.demo06.StaticMethodReference;

public class Demo01StaticMethodReference {

    public static int method(int number,Calcable c){
        return c.calcAbs(number);
    }


    public static void main(String[] args) {
        int i = method(-10, n -> {
            return Math.abs(n);
        });
        System.out.println(i);

        int i1 = method(-10, Math::abs);
        System.out.println(i1);

    }
}
