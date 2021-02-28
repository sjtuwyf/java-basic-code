package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);

        int i = 1;
        System.out.println("输入数字");

        while (true) {
            if(i==5){
                System.out.println("你输了");
                break;
            }
            int guessNum = sc.nextInt();
            if(guessNum>num){
                System.out.println("大了");
            }else if(guessNum<num){
                System.out.println("小了");
            } else {
                System.out.println("对了");
                break;
            }
            i++;
        }

    }
}
