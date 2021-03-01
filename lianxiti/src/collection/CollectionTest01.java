package collection;

import java.util.ArrayList;

public class CollectionTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        System.out.println(listTest(list,"a"));
        System.out.println(listTest(list,"b"));
        System.out.println(listTest(list,"c"));
        System.out.println(listTest(list,"abc"));
    }

    public static int listTest(ArrayList<String> list, String s) {
        int count = 0;
        for (String s1 : list) {
            if (s.equals(s1)){
                count++;

            }
        }
        return count;
    }
}
