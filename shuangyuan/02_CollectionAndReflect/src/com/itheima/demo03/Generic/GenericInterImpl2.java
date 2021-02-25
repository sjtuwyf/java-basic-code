package com.itheima.demo03.Generic;

public class GenericInterImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
