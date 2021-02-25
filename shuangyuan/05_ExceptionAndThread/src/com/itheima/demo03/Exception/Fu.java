package com.itheima.demo03.Exception;

public class Fu {

    public void show01() throws NullPointerException,ClassCastException{

    }

    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() {}


}


class Zi extends Fu{

    @Override
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }

    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }

    @Override
    public void show03()  {
        super.show03();
    }

    @Override
    public void show04()  {
//        super.show04();
        try {
            throw new Exception("异常");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}