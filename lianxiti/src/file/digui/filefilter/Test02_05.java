package file.digui.filefilter;

import java.io.File;
import java.util.Scanner;

public class Test02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sin please");
        String s = scanner.nextLine();
        File file = new File(s);
        File[] files = file.listFiles();
        for (File file1 : files) {
            file1.delete();
        }

        file.delete();
    }
}
