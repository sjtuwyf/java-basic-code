package cn.itcast.day08.demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room = "101教室";
        System.out.println(one.getName()+one.getAge()+one.room+one.getId());
        Student two = new Student("黄蓉",16);
        System.out.println(two.getName()+two.getAge()+two.room+two.getId());

    }
}
