package collection;

import java.util.ArrayList;

public class CollectionTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(123);
        list.add(123);

        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
