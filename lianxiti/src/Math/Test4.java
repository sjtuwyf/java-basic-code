package Math;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printCount(scanner.next(),scanner.next());
    }

    public static void printCount(String srcStr,String delStr){
        System.out.println(srcStr.replace(delStr,""));
    }
}
