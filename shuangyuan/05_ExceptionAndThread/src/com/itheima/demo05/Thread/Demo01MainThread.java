package com.itheima.demo05.Thread;

public class Demo01MainThread {

    public static void main(String[] args) {
        Person p1 = new Person("a");
        p1.run();
        Person p2 = new Person("b");
        p2.run();

    }
}
