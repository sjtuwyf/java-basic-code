package cn.itcast.day10.demo03;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefult(){
        System.out.println("A");
    }
}
