package zhuanhuanliu.gaoxiaoliu;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test02_04 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("lianxiti/file/t.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }


        br.close();

        Collections.reverse(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter("lianxiti/file/tt.txt"));

        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
