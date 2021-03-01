package collection;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTest08 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100)+1;
            if (arr[i]>=10){
                list.add(arr[i]);
            }
        }

        System.out.println(list);



    }
}
