package list.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cin please");
        String line = scanner.nextLine();
        LinkedHashSet<Character> chs = new LinkedHashSet<>();
        char[] charArray = line.toCharArray();

        for (char c : charArray) {
            chs.add(c);
        }

        for (Character ch : chs) {
            System.out.println(ch);
        }
    }
}
