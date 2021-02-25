package cn.day06.itcast.demo03;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
        person.setAge(18) ;
        person.show();
    }
}
