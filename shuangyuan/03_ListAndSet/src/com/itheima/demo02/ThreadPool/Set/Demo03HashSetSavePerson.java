package com.itheima.demo02.ThreadPool.Set;

import java.util.HashSet;

public class Demo03HashSetSavePerson {


    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("abc", 18);
        Person p2 = new Person("abc", 18);
        Person p3 = new Person("abc", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
