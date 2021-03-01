package list.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");

        Iterator<String> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        for (String s : linkedHashSet) {


            System.out.println(s);

        }
    }
}
