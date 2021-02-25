package com.itheima.demo04.Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("abc");
            }
        });

        invokeCook(() -> {
            System.out.println("abc");
        });

        invokeCook(() -> System.out.println("abc"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
