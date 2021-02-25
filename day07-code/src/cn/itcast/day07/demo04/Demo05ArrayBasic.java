package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayBasic {
    public static void main(String[] args) {
        ArrayList<String> listA =new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println(num);
    }
}
