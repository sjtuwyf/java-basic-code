package zhuanhuanliu.gaoxiaoliu;

import java.io.*;

public class Test01_06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("lianxiti/file/xx.txt"), "UTF-8");
        char[] chars = new char[1024];
        int len= -1;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(
                    new String(chars, 0, len)
            );

        }
        isr.close();

    }
}
