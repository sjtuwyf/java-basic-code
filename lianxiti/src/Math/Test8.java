package Math;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(count(scanner.nextInt(),scanner.nextInt(),scanner.next()));
    }

    public static String count(int a,int b,String op){
        int r = 0;
        if (op.equals("+")){
            r = a+b;
        } else if(op.equals("-")){
            r = a-b;
        } else if(op.equals("*")){
            r = a*b;
        } else if(op.equals("/")){
            r = a/b;
        } else if (op.equals("%")){
            r = a%b;
        } else {
            return null;
        }

        return r+"";
    }

}
