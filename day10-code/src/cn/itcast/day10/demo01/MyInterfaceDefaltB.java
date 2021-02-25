package cn.itcast.day10.demo01;

public class MyInterfaceDefaltB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("B 重写了 默认方法");
    }
}
