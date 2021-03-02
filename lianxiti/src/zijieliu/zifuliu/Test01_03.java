package zijieliu.zifuliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("lianxiti/file/b.txt", true);

        String content = "love \r\n";
        for (int i = 0; i < 5; i++) {
            fos.write(content.getBytes());

        }

        fos.close();
    }
}
