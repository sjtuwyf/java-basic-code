package com.itheima.demo02.ThreadPool.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01HashMapSavePerson {

    public static void main(String[] args) {

//        show01();
        show02();

    }

    private static void show02() {

        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("a",18),"abc");
        map.put(new Person("b",19),"bca");
        map.put(new Person("c",20),"cba");
        map.put(new Person("a",18),"acb");

        for (Map.Entry<Person, String> entry : map.entrySet()) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }


    }

    private static void show01() {

        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("深圳",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key+value);
        }


    }
}
