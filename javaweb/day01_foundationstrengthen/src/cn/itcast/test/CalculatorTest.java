package cn.itcast.test;


import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init...");

    }

    @After
    public void close(){
        System.out.println("close...");
    }


    @Test
    public void testAdd(){
//        System.out.println("执行了");


        System.out.println("testAdd...");

        Calculator c = new Calculator();
        int add = c.add(1, 2);
//        System.out.println(add);

        Assert.assertEquals(3,add);
    }

    @Test
    public void testSub(){
        int sub = new Calculator().sub(1, 2);
        System.out.println("testSub...");
        Assert.assertEquals(-1,sub);
    }

}
