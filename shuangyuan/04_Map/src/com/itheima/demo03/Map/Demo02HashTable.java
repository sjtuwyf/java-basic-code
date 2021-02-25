package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("a",null);
        map.put(null,null);
        System.out.println(map);

//        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,"a");

    }


}
