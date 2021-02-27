package com.itheima.demo08.ThisMethodReference;
/*
    使用this引用本类的成员方法
 */
public class Husband {

    public void buyHouse(){
        System.out.println("上海大平层");
    }

    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
//        marry(()->{
//            this.buyHouse();
//        });

        marry(this::buyHouse);
    }


    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
