package hanshusijiekou.fangfayinyong;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class Test001 {
    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        String[] obj = getObj(() -> new String[5]);

        HashSet<Integer> obj1 = getObj(() -> {
            Random random = new Random();
            HashSet<Integer> integers = new HashSet<>();
            while (integers.size() < 5) {
                integers.add(random.nextInt(20) + 1);
            }
            return integers;
        });

        Calendar obj2 = getObj(() -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, 2021);
            calendar.set(Calendar.MONTH, 2);
            calendar.set(Calendar.DAY_OF_MONTH, 3);
            return calendar;
        });

        System.out.println(obj);
        for (String s : obj) {
            System.out.println(s);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}