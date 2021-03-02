package file.digui.filefilter;

import java.io.File;

public class Test01_05 {
    public static void main(String[] args) {
        File file = new File("lianxiti/file/a.txt");
        file.delete();

        File file1 = new File("lianxiti/file/bbb");
        file1.delete();
    }
}
