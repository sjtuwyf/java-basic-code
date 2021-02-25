package com.itheima.demo04.MyException;

import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames = {"a","b","c"};

    public static void main(String[] args) /*throws RegisterException*/ {

        Scanner sc = new Scanner(System.in);
        System.out.println("cin:");

        String username = sc.next();

        checkUsername(username);
    }

    private static void checkUsername(String username) /*throws RegisterException*/ {
        for (String name : usernames) {
            if(name.equals(username)){
                try {
                    throw new RegisterException("用户名已经注册过了");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }


}
