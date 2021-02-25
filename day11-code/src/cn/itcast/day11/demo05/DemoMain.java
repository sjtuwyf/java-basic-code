package cn.itcast.day11.demo05;

public class DemoMain {

    public static void main(String[] args) {
//        MyInterfacce obj = new MyInterfaceImpl();
//        obj.method();

        MyInterfacce obj = new MyInterfacce() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法1");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2");

            }


        };
        obj.method();
        obj.method2();

        new MyInterfacce(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法1");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2");

            }
        }.method();

    }
}
