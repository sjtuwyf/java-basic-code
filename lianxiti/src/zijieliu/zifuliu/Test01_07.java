package zijieliu.zifuliu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01_07 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("lianxiti/file/Info.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("cin please");
            String s = scanner.nextLine();

            if (s.equals("886")) {
                break;
            } else {
                fileWriter.write(s);
                fileWriter.write(System.lineSeparator());
            }
        }

        fileWriter.close();
    }
}
