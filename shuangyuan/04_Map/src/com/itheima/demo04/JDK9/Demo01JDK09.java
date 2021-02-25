package com.itheima.demo04.JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01JDK09 {

    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
//        list.add("w");

        Set<String> set = Set.of("a", "b", "c", "d", "e");
        System.out.println(set);
//        set.add("a");

        Map<String, Integer> map = Map.of("a", 18, "b", 19, "c", 20);
        System.out.println(map);
//        map.put("x",0);

    }
}
