package com.itheima.demo07.SuperMethodReference;
/*
    定义子类
 */
public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello 我是man!");
    }

    public void method(Greetable g){
        g.greet();
    }

    public void show(){
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });

//        method(()->{
//            super.sayHello();
//        });

        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();

    }
}
