package cn.itcast.day10.demo06;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouth(){
        System.out.println("猫抓老鼠");
    }
}
