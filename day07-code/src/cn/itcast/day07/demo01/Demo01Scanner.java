package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
//        String str = "123";
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        String str = sc.next();
        System.out.println(str);
    }
}
