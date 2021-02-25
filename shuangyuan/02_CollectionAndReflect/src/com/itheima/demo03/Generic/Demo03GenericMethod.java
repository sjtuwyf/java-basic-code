package com.itheima.demo03.Generic;

public class Demo03GenericMethod {

    public static void main(String[] args) {

        GenericMethod gm = new GenericMethod();

        gm.method(10);
        gm.method(0.3);
        gm.method("afasdf");
        gm.method('s');

        gm.method02('s');

        GenericMethod.method02(123);
        GenericMethod.method02("sfasafs");
    }
}
