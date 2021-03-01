package Map;

import java.util.HashMap;
import java.util.Set;

public class MapTest04 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "张三丰");
        map.put(2, "张三丰");
        map.put(3, "张三丰");
        map.put(4, "张三丰");

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key+map.get(key));

        }

        map.put(5, "张无忌");

        map.remove(1);

        map.put(2,"周芷若");

        System.out.println(map);
    }
}
