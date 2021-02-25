package com.itheima.demo03.Generic;

public class GenericMethod {

    public <M> void method(M m){
        System.out.println(m);
    }

    public static <S> void method02(S s){
        System.out.println(s);
    }
}
