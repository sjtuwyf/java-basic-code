package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,6,2,4,6,2);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
//                return o1-o2;
            }
        });

        System.out.println(list);

        ArrayList<Student> list1 = new ArrayList<>();
        Collections.addAll(list1,new Student("a",18),new Student("b",17),new Student("c",19),new Student("a",19));
        System.out.println(list1);
//        Collections.sort(list1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                if(i==0){
                    i = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return i;
            }
        });

        System.out.println(list1);



    }
}
