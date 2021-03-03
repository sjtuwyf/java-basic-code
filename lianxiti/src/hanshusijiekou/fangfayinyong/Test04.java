package hanshusijiekou.fangfayinyong;

import java.util.Random;

public class Test04 {
    public static void getRandomNumFromOneToNum(int num, NumberSupplier numberSupplier) {
        int num1 = numberSupplier.getNum(num);
        System.out.println(num1);
    }

    public static void getRandomNumFromAToB(int a, int b, NumberSupplier numberSupplier) {
        int i = numberSupplier.getNum(a,b) ;
        System.out.println(i);
    }

    public static void getRandomNumFromArray(int[] nums, NumberSupplier numberSupplier) {
        int num1 = numberSupplier.getNum(nums);
        System.out.println(num1);
    }

    public static void main(String[] args) {
        RandomUtil randomUtil = new RandomUtil();
        Random random = new Random();
        getRandomNumFromOneToNum(5, randomUtil::nextInt);
//        getRandomNumFromOneToNum(5,random::nextInt);
        getRandomNumFromAToB(2,20,randomUtil::nextInt);
        int[] arr={1,2,3,4,5};
        getRandomNumFromArray(arr,randomUtil::nextInt);


    }


}
