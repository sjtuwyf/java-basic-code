package cn.itcast.day07.demo02;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name="高圆圆";
        one.showName();


        new Person().name="刘亦菲";
        new Person().showName();
    }
}
