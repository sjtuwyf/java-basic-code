package RandomAndArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        printCount(getNumList());
    }

    public static ArrayList<Integer> getNumList(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(10)+1);
        }

        return list;
    }

    public static void printCount(ArrayList<Integer> list){
        int[] ints = new int[10];
        for (int i = 0; i < list.size(); i++) {
            ints[list.get(i)-1]++;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
