package list.set;

import java.util.LinkedList;

public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("西门吹雪");
        arr.add("西门吹雪");
        arr.add("西门吹雪");
        arr.add("西门吹雪");
        arr.add("西门吹雪");

        arr.add(3, "西门");

        arr.set(0, "东门");
        for (String s : arr) {
            System.out.println(s);

        }

        System.out.println("----------------");
        System.out.println(arr.get(1));
        System.out.println(arr.size());

        arr.remove(3);

        arr.clear();

        System.out.println(arr);


    }




}
