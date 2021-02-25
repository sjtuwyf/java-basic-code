package com.itheima.demo06.Test;

import java.util.*;

public class DouDiZhu {

    public static void main(String[] args) {

        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1");

        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> di = new ArrayList<>();


        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                p1.add(list.get(i));

            }else if(i%3==1){
                p2.add(list.get(i));
            }else if(i%3==2){
                p3.add(list.get(i));
            }
        }
        di.add(list.get(51));
        di.add(list.get(52));
        di.add(list.get(53));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(di);

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(di);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(di);


        //
        map.put(0, "WANG");
        map.put(1, "wang");
        Integer i = 2;

        for (String number : numbers) {
            for (String color : colors) {
                map.put(i, color + number);
                i++;
            }
        }
        System.out.println(map);

        kanPai(p1,map);
        kanPai(p2,map);
        kanPai(p3,map);
        kanPai(di,map);


    }

    private static void kanPai(ArrayList<Integer> list, HashMap<Integer,String> map) {
        for (Integer integer : list) {
            System.out.print(map.get(integer));
        }
        System.out.println();
    }
}
