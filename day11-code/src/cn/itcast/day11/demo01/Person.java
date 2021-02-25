package cn.itcast.day11.demo01;

public class Person {

    private final String name ;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person() {
        name = "abc";
    }

    public Person(String name) {

        this.name = name;
    }
}
