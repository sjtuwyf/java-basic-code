package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success=list.add("a");
        System.out.println(list);
        System.out.println(success);

        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        String name = list.get(2);
        System.out.println(name);

        String removed = list.remove(3);
        System.out.println(removed);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

    }
}
