package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest08 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"asfd");
        hashMap.put(2,"fasfd");
        hashMap.put(3,"assffd");
        hashMap.put(4,"sdasfd");
        hashMap.put(5,"fd");
        hashMap.put(6,"aASFsfd");
        hashMap.put(7,"asfsfsd");
        hashMap.put(8,"asfSFADd");

        System.out.println("cin please");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        boolean b = hashMap.containsValue(s);


        if (b == true) {
            for (Integer integer : hashMap.keySet()) {
                if (hashMap.get(integer).equals(s)) {
                    System.out.println(integer+s);
                }
            }



        } else {
            System.out.println("sorry");
        }

    }
}
