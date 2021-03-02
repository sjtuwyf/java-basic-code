package file.digui.filefilter;

import java.io.File;

/**
 * @author ssqswyf
 *
 */

public class Test01_01 {
    public static void main(String[] args) {

        File file = new File("d:/IdeaProjects/basic-code/lianxiti/file");

        file.mkdirs();

        File file1 = new File("file/a.txt");
    }
}
