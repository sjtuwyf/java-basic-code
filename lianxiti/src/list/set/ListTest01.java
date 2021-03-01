package list.set;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("F");
        list.add("G");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)=="c") {
                list.set(i, "abc");
            }
        }



        System.out.println(list);

    }
}
