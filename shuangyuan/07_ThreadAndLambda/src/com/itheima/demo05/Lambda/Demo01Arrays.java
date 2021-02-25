package com.itheima.demo05.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {

    public static void main(String[] args) {

        Person[] arr ={
          new Person("a",3),
          new Person("b",2),
          new Person("c",1),

        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();}
            );

        Arrays.sort(arr,( o1, o2)-> o1.getAge()-o2.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
