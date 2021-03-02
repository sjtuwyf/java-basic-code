package zhuanhuanliu.gaoxiaoliu;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lianxiti/file/e.txt"));
        bos.write("I love Java".getBytes());
        bos.close();
    }
}
