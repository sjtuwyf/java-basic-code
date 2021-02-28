package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;



public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addName(List<String> list){
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        return list;
    }

}
