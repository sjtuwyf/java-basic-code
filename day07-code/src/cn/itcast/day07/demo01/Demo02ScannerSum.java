package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数：");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}
