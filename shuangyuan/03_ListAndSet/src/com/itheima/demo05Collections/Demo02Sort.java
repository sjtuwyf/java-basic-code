package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,6,2,4,6,2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        ArrayList<String>  list1 = new ArrayList<>();
        Collections.addAll(list1,"a","c","b");
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Person> list2 = new ArrayList<>();
        Collections.addAll(list2,new Person("a",18),new Person("b",17),new Person("c",19));

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);


    }
}
