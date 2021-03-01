package collection;

public class Demo09 {
    public static void main(String[] args) {
        Integer[] a= {1,2,3,4,5};
        method(a, 1, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static <E> void method(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;

    }
}
