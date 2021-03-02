package file.digui.filefilter;

import java.io.File;
import java.util.Scanner;

public class Test02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cin please:");
        String s = scanner.nextLine();
        File file = new File(s);
        if (file.isFile()) {
            System.out.println(file.length());
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            long len = 0L;
            for (File file1 : files) {
                len += file1.length();

            }
            System.out.println(len);


        }
    }
}
