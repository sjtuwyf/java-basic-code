package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();

//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

//        methodParam(new Scanner(System.in));

        Scanner sc= methodReturn();
        int num = sc.nextInt();
        System.out.println(num);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
