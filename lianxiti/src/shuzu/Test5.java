package shuzu;

public class Test5 {
    public static void main(String[] args) {
        int[] score={12,34,65,76,78,45,78,65,36,90,86,8,99,100,43,73,26,35};
        System.out.println(getDashu(score,getAvg(score)));
    }

    public static int getAvg(int[] intArray){
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum+=intArray[i];
        }
        return sum/intArray.length;
    }

    public static int getDashu(int[] intArray,int avg){
        int num=0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]>avg){
                num++;
            }
        }
        return num;
    }
}
