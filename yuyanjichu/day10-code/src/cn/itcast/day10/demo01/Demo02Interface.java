package cn.itcast.day10.demo01;

public class Demo02Interface {

    public static void main(String[] args) {

        MyInterfaceDefaltA a = new MyInterfaceDefaltA();
        a.methodAbs();

        a.methodDefault();

        MyInterfaceDefaltB b = new MyInterfaceDefaltB();
        b.methodAbs();

        b.methodDefault();
    }
}
