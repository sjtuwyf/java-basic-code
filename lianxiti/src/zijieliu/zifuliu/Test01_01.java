package zijieliu.zifuliu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_01 {
    public static void main(String[] args) throws IOException {
        String  s = "lianxiti/file/b.txt";
        File file = new File(s);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(s);

        fos.write(97);
        fos.close();

    }
}