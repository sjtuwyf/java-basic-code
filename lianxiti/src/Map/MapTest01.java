package Map;

import java.util.HashMap;

public class MapTest01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");

        String v1 = map.put("c", "cd");

        String string = map.get("d");
        System.out.println(string);

        String v2 = map.remove("d");
        System.out.println(v2);
        System.out.println(map);
    }
}
