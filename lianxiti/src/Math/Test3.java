package Math;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String next1 = scanner.next();
        System.out.println(getCount(next,next1));


    }

    public static int getCount(String big,String small){

        int index = 0;
        int count = 0;
        while ((index = big.indexOf(small,index))!=-1){
            index++;
            count++;
        }
        return count;




    }
}
