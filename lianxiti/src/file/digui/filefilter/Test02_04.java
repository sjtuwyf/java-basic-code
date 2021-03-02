package file.digui.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Test02_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cin please");
        String s = scanner.nextLine();
        File file = new File(s);


//        File file = new File("lianxiti/Map");

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                if (pathname.getName().endsWith(".java")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
    }
}
