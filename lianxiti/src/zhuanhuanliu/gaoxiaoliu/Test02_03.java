package zhuanhuanliu.gaoxiaoliu;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test02_03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cin");
        String s = scanner.nextLine();
        PrintStream ps = new PrintStream("lianxiti/file/xxx.txt");
        ps.println(s);
        ps.close();
    }
}
