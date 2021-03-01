package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapTest02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");

        Collection<String> values = map.values();

        for (String value : values) {
            System.out.println(value);
        }

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
