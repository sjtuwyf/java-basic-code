package cn.itcast.day10.demo03;

public interface MyInterfaceB {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefult(){
        System.out.println("B");
    }
}
