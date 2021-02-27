package com.itheima.demo09.ConstructorMethodReference;
/*
    类的构造器(构造方法)引用
 */
public class Demo {

    public static void printName(String name,PersonBuilder pb){

        Person person = pb.buildPerson(name);
        System.out.println(person.getName());
    }



    public static void main(String[] args) {
        printName("迪丽热巴",name->{
            return new Person(name);
        });

        printName("迪丽热巴",Person::new);

    }
}
