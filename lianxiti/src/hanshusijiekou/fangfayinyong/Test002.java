package hanshusijiekou.fangfayinyong;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Test002 {
    public static <T> void doTob(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }

    public static <T> void doTob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",99);
        map.put("b",97);
        map.put("c",69);
        map.put("d",79);
        map.put("e",89);

        doTob(map,m-> System.out.println(map.get("a")));
        doTob(map,m->{
            Collection<Integer> values = m.values();
            int max = 0;
            for (Integer value : values) {
                if (value > max) {
                    max=value;
                }
            }
            System.out.println(max);
        });

        doTob(map,m->{
            Set<Map.Entry<String, Integer>> set = m.entrySet();
            for (Map.Entry<String, Integer> entry : set) {
                if (entry.getValue() >= 60) {
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
            }
            System.out.println();
        },m->{
            Set<Map.Entry<String, Integer>> set = m.entrySet();
            for (Map.Entry<String, Integer> entry : set) {
                if (entry.getValue() >= 70) {
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
            }
            System.out.println();
        });
    }
}
