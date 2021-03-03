package hanshusijiekou.fangfayinyong;

public class Tesst02 {
    public static void main(String[] args) {

        getProduct(2,3,(a,b)->a*b);

    }

    public static void getProduct(int a, int b, Incalc incalc) {
        int calc = incalc.calc(a, b);
        System.out.println(calc);
    }
}
