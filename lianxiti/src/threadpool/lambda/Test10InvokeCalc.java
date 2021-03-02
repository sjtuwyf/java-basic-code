package threadpool.lambda;

public class Test10InvokeCalc {
    public static void main(String[] args) {

//        invokeCalc(1,2,(int a,int b)->{
//            return a+b;
//        });

        invokeCalc(1,2,(a,b)->a+b);


    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println(result);
    }
}
