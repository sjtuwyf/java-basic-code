package zijieliu.zifuliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lianxiti/file/b.txt");
        int len  = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        fis.close();
    }
}
