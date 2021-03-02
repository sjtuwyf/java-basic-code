package zhuanhuanliu.gaoxiaoliu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01_04 {
    public static void main(String[] args) throws IOException {
        writeStringToFile();
        verifyC();
    }

    private static void verifyC() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("lianxiti/file/data.txt"));
        String  s = null;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        br.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("cin");
        String s1 = scanner.nextLine();

        if (list.contains(s1)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }

    private static void writeStringToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("lianxiti/file/data.txt"));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            String s = scanner.nextLine();
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
