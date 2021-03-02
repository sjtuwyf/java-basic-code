package zijieliu.zifuliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lianxiti/file/a.jpg");
        FileOutputStream fos = new FileOutputStream("lianxiti/file/b.jpg");

        int len = -1;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
