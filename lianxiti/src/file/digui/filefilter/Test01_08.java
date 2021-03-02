package file.digui.filefilter;

import java.io.File;

public class Test01_08 {
    public static void main(String[] args) {
        File file = new File("lianxiti/file");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
