package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {

    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);

        boolean b1 = map.containsKey("a");
        System.out.println(b1);
        boolean b2 = map.containsKey("d");
        System.out.println(b2);

    }

    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);

        Integer v1 = map.get("b");
        System.out.println(v1);

        Integer v2 = map.get("d");
        System.out.println(v2);

    }

    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);

        Integer v1 = map.remove("a");
        System.out.println(v1);
        System.out.println(map);

        Integer v2 = map.remove("d");
        System.out.println(v2);
        System.out.println(map);

    }

    private static void show01() {
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("abc","cba1");
        String v2 = map.put("abc","cba2");
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(map);

        map.put("sdf","fds");
        map.put("ert","tre");
        map.put("ddg","gdd");
        System.out.println(map);
    }
}
