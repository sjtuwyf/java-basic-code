package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1=new Student("a",18);
        list.add(s1);
        list.add(new Student("b",18));
        list.add(new Student("c",18));
        list.add(new Student("d",18));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
