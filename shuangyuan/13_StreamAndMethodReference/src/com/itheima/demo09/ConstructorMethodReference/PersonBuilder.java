package com.itheima.demo09.ConstructorMethodReference;
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    Person buildPerson(String name);
}
