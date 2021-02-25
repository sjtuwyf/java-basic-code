package Math;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        System.out.println(isP(next));
    }

    public static boolean isP(String str){
        for (int i = 0; i < str.length()+1-i; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;

    }
}
