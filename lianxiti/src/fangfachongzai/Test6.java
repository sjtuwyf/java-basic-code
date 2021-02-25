package fangfachongzai;

public class Test6 {
    public static void main(String[] args) {
        printX(8);
    }

    public static void printX(int num) {
        for (int i = 1; i <= num; i++) {
            for (int i1 = 1; i1 <= num; i1++) {
                if(i==i1||i==num+1-i1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
