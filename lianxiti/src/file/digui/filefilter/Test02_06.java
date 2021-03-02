package file.digui.filefilter;

import java.io.File;
import java.util.Scanner;

public class Test02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cin please");
        String s = scanner.nextLine();

        File file = new File(s);

        long len = calc(file);
        System.out.println(len);


    }

    private static long calc(File file) {

        long len = 0L;

        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                len += calc(file1);
            }
            return len;
        }
        return len;
    }
}
