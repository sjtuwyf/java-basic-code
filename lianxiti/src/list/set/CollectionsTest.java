package list.set;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);


        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
