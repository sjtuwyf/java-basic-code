package cn.itcast.day10.demo02;

import cn.itcast.day10.demo01.MyInterfaceDefaltA;
import cn.itcast.day10.demo01.MyInterfaceDefaltB;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {




    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }

    @Override
    public void methodB() {
        System.out.println("B");
    }

}
