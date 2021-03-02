package file.digui.filefilter;

import java.util.Scanner;

public class Test02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(fun(i));
    }

    private static int fun(int i) {

        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fun(i - 1) + fun(i - 2);
        }
    }
}
