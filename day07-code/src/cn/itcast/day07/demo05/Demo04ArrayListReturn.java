package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }



        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(isOu(list.get(i))){
                list1.add(list.get(i));
            }
        }

        ArrayList<Integer> list2 = getSmallList(list);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list2);
        System.out.println(list2.size());
    }

    public static boolean isOu(int num) {
        return num % 2 == 0;
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(isOu(list.get(i))){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}


