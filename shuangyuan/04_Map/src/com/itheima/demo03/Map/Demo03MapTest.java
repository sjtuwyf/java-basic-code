package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Demo03MapTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();


        System.out.println("cin please:");
//        System.out.println(":");
        String s = sc.next();

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if(map.containsKey(aChar)){
                int value = map.get(aChar);
                value++;
                map.put(aChar,value);
            }else {
                map.put(aChar,1);
            }
        }

        System.out.println(map);
    }
}
