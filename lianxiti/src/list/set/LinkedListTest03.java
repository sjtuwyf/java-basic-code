package list.set;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest03 {
    public static void main(String[] args) {

        String[] strs = {"12345","67891","2347809933","98765432102","67891","123447809933"};

        LinkedList<String> list = new LinkedList<>();
        for (String str : strs) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
