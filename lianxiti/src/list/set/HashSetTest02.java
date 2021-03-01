package list.set;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hs = new HashSet<>();

        while (hs.size() < 6) {
            int i = random.nextInt(33) + 1;
            hs.add(i);
        }

        int i = random.nextInt(16) + 1;

        for (Integer h : hs) {
            System.out.println(h);
        }

        System.out.println(i);
    }
}
