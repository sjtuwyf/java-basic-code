package collection;

public class Demo13 {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        method(a);


    }


    public static <E> void method(E[] e){
        for (int i = 0; i < e.length-1-i; i++) {
            E temp=e[i];
            e[i] = e[e.length - 1 - i];
            e[e.length-1-i]=temp;
        }

        for (E e1 : e) {
            System.out.println(e1);
        }
    }
}
