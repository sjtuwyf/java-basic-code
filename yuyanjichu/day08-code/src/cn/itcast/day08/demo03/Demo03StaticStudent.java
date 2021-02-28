package cn.itcast.day08.demo03;

public class Demo03StaticStudent {

    public static void main(String[] args) {
        Student.room = "103教室";

        Student one = new Student("郭靖",20);
        System.out.println(one.getName()+one.getAge()+one.room);

        Student two = new Student("黄蓉",18);
        System.out.println(one.getName()+one.getAge()+one.room);

    }
}
