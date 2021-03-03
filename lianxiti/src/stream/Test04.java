package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Test04 {
    public static void main(String[] args) {
        Function<ArrayList<Integer>,Integer> f1 = list -> {
            Integer sum =0;
            for (Integer integer : list) {
                sum+=integer;
            }
            return sum/list.size();
        };


        Function<Map<String,Integer>,ArrayList<Integer>> f2 = map->{
            ArrayList<Integer> list = new ArrayList<>();
            for (String s : map.keySet()) {
                Integer integer = map.get(s);
                list.add(integer);
            }
            return list;
        };


        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",99);
        map.put("b",98);
        map.put("c",92);
        map.put("d",96);
        map.put("e",97);

        Integer avg = f2.andThen(f1).apply(map);
        System.out.println(avg);
    }
}
