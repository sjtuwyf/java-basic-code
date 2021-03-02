package file.digui.filefilter;


import java.io.File;
import java.io.IOException;

/**
 * @author ssqswyf
 */


public class Test01_02 {
    public static void main(String[] args) throws IOException {
        File file = new File("lianxiti/file/a.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

    }
}
