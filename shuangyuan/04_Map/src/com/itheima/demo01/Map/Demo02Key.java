package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02Key {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+value);
        }

        for (String s : set) {
            System.out.println(s+map.get(s));
        }
        for (String s : map.keySet()) {
            System.out.println(s+map.get(s));
        }



    }
}
