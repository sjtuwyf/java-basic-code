package cn.itcast.day10.demo05;

public class Zi extends Fu{
    int num =20;
    int a = 10;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("方法子");
    }

    public void methodZi(){
        System.out.println("特有子");
    }
}
