package Map;

import java.util.HashMap;

public class MapTest05 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            map.put(arr1[i], arr2[i]);
        }

        System.out.println(map);
    }
}
