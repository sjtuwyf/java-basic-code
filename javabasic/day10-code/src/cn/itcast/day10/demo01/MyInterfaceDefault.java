package cn.itcast.day10.demo01;

public interface MyInterfaceDefault {

    public abstract void methodAbs();

//    public abstract void methodAbs2();

    public default void methodDefault(){
        System.out.println("默认方法");
    }



}
