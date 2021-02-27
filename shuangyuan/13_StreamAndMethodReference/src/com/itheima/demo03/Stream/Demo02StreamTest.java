package com.itheima.demo03.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    练习：集合元素处理（Stream方式）
    将上一题当中的传统for循环写法更换为Stream流式处理方式。
    两个集合的初始内容不变，Person类的定义也不变。
 */
public class Demo02StreamTest {

    public static void main(String[] args) {

        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);


        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(p-> System.out.println(p));

    }

}
