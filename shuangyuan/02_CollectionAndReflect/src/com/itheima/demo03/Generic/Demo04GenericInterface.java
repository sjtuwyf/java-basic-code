package com.itheima.demo03.Generic;

public class Demo04GenericInterface {

    public static void main(String[] args) {
        GenericInterImpl1 gi1 = new GenericInterImpl1();
        gi1.method("asdf");

        GenericInterImpl2<Integer> gi2 = new GenericInterImpl2<>();
        gi2.method(10);

        GenericInterImpl2<Double> gi3 = new GenericInterImpl2<>();
        gi3.method(2.2);
    }
}
