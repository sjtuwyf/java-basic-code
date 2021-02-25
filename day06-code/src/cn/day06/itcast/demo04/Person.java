package cn.day06.itcast.demo04;

public class Person {
    String name;

    public void sayHello(String name) {
        System.out.println(name + this.name);
        System.out.println(this);
    }
}
