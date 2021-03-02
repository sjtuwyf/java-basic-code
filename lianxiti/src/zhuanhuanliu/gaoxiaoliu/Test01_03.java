package zhuanhuanliu.gaoxiaoliu;

import java.io.*;

public class Test01_03 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lianxiti/file/a.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lianxiti/file/x.jpg"));
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();

    }
}
