package RandomAndArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
//        puke();
        ArrayList<String> random = random(puke(), 5);
        for (int i = 0; i < random.size(); i++) {
            System.out.println(random.get(i));
        }

    }

    public static ArrayList<String> random(ArrayList<String> list,int i){
        if (i>54||i<1){
            System.out.println("超出范围");
            return null;
        }
        ArrayList<String> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i1 = 0; i1 < i; i1++) {
            list1.add(list.get(random.nextInt(54)));
        }
        return list1;

    }

    public static ArrayList<String> puke(){
        String[] s1={"♠","♥","♣","♦"};
        String[] s2={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        ArrayList<String> list = new ArrayList<>();
        list.add("大王");
        list.add("小王");

        for (String s : s1) {
            for (String s3 : s2) {
                list.add(s+s3);
            }
        }

//        for (String s : list) {
//            System.out.println(s);
//        }
        return list;
    }
}
