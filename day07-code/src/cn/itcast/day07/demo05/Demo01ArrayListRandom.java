package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }
    }

}
