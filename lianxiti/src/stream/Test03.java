package stream;

import java.util.function.Predicate;

public class Test03 {
    public static void main(String[] args) {
        Integer[] arr = {-12345,9999,520,0,-38,-77585220,941213};

        Predicate<Integer> p1 = (s)->s>=0;
        Predicate<Integer> p2 = (s)->Math.abs(s)>100;
        Predicate<Integer> p3 = (s)->s%2==0;

        int c1 =0;
        int c2 =0;
        int c3 =0;
        int c4 =0;

        for (Integer integer : arr) {
            if (p1.test(integer)) {
                c1++;
            }

            if (p1.negate().test(integer)) {
                c2++;
            }
            if (p2.and(p3).test(integer)) {
                c3++;
            }
            if (p1.negate().or(p3).test(integer)) {
                c4++;
            }
        }

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


    }
}
