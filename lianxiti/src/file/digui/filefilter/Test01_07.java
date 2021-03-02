package file.digui.filefilter;

import java.io.File;

public class Test01_07 {
    public static void main(String[] args) {
        File file = new File("lianxiti/file/b.txt");
        boolean file1 = file.isFile();
        if (file1 == true) {
            System.out.println("is file");
        } else {
            System.out.println("is not file");
        }

        boolean directory = file.isDirectory();
        if (directory == true) {
            System.out.println("id dir");
        } else {
            System.out.println("is not dir");
        }
    }
}
