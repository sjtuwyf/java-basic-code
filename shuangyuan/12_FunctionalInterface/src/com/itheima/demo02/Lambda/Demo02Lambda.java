package com.itheima.demo02.Lambda;
/*
    使用Lambda优化日志案例
    Lambda的特点:延迟加载
    Lambda的使用前提,必须存在函数式接口
 */
public class Demo02Lambda {

    public static void showLog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1,()->{
            System.out.println("x");
            return msg1+msg2+msg3;
        });
    }

}
