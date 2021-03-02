package file.digui.filefilter;

import java.io.File;

public class Test01_06 {
    public static void main(String[] args) {
        File file = new File("lianxiti/file/b.txt");
        String name = file.getName();
        long length = file.length();
        String absolutePath = file.getAbsolutePath();
        String path = file.getPath();
        String parent = file.getParent();
        File parentFile = file.getParentFile();
        System.out.println(name);
        System.out.println(length);
        System.out.println(path);
        System.out.println(parent);
    }
}
