package cn.itcast.day10.demo06;

public class Demo01Main {

    public static void main(String[] args) {
        Animal animal =new Cat();
        animal.eat();


        Cat cat = (Cat)animal;
        cat.catchMouth();

    }
}
