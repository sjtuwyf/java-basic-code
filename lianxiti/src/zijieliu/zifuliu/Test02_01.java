package zijieliu.zifuliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_01 {
    public static void main(String[] args) throws IOException {
        calc('a');
    }

    private static void calc(char a) throws IOException {
        FileInputStream fis = new FileInputStream("lianxiti/file/b.txt");

        int count = 0;
        int len =-1;
        while ((len = fis.read())!=-1){
            if (len == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
