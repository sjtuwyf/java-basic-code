package cn.itcast.day08.demo04;

public class Demo04MathPractice {
    public static void main(String[] args) {
        System.out.println(num(-10.8,5.9,6,2.1));
    }

    public static int num(double a, double b, double c, double d) {
        int a1 = (int) Math.ceil(a);
        int b1 = (int) Math.floor(b);
        int count = 0;
        for (int i = a1; i <= b1; i++) {
            if(Math.abs(i)>c||Math.abs(i)<d){
                count++;
            }
        }
        return count;

    }
}
