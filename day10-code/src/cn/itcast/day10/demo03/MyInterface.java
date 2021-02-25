package cn.itcast.day10.demo03;

import cn.itcast.day10.demo02.MyInterfaceA;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {

    }

    public abstract void methodCommon();
}
