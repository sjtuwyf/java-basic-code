package cn.itcast.day10.demo01;

public interface MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodDefaultCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodDefaultCommon();
    }

    private void methodDefaultCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }


}
