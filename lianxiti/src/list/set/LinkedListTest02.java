package list.set;

import java.util.LinkedList;

public class LinkedListTest02 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();

        linked.add("周杰伦");
        linked.add("周星驰");
        linked.add("周润发");
        linked.add("周华健");

        linked.addFirst("周传雄");
        linked.addLast("周渝民");

        System.out.println(linked);

        System.out.println(linked.getLast());

        String first = linked.getFirst();
        System.out.println(first);

        String first1 = linked.removeFirst();
        System.out.println(first1);

        String last = linked.removeLast();

        System.out.println(last);

        System.out.println(linked);

        String pop = linked.pop();
        System.out.println(pop);

        linked.push("周立波");
        System.out.println(linked);

        linked.clear();
        System.out.println(linked);


    }
}
