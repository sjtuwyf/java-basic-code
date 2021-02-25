package fangfachongzai;

public class Test7 {
    public static void main(String[] args) {
        System.out.println(round(0.5));
        System.out.println(round(0.2));
        System.out.println(round(1.9));
    }

    public static int round(double d){
        return (int)(d+0.5);
    }
}
