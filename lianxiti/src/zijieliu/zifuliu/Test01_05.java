package zijieliu.zifuliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01_05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lianxiti/file/b.txt");

        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
    }
}
