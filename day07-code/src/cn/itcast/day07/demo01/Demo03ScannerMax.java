package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp =a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(temp);
    }
}
