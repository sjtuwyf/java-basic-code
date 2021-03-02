package zhuanhuanliu.gaoxiaoliu;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("lianxiti/file/x.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.close();
        fos.close();

    }
}
