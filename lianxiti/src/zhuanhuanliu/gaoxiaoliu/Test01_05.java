package zhuanhuanliu.gaoxiaoliu;

import java.io.*;

public class Test01_05 {
    public static void main(String[] args) throws IOException {
        String s = "I love java";
        FileOutputStream fos = new FileOutputStream("lianxiti/file/xx.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");

        osw.write(s);
        osw.close();
    }
}
