package com.itheima.demo10.ArrayMethodReference;
/*
    定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    int[] builderArray(int length);
}
