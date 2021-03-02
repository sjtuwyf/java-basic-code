package zijieliu.zifuliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test02_02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("lianxiti/file/stu.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("cin please");

        try (fos; scanner) {
            while (true) {
                String s = scanner.nextLine();
                if (s.equals("end")) {
                    break;
                }
                fos.write(s.getBytes());
                fos.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
