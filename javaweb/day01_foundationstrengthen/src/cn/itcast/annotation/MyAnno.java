package cn.itcast.annotation;



public @interface MyAnno {

    int value();
//    String name() default "张三";
//    String show2();
//
    Person per();
    MyAnno2 anno2();
//
    String[] strs();





}
