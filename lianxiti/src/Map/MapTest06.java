package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (String s : list) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                Integer integer = hashMap.get(c);
                if (integer == null) {
                    hashMap.put(c,1);
                }else {
                    hashMap.put(c,integer+1);
                }
            }
        }

        System.out.println(hashMap);
    }
}
