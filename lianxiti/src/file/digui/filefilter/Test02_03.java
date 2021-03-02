package file.digui.filefilter;

public class Test02_03 {
    public static void main(String[] args) {
        System.out.println(sumPeach(1));
    }

    private static int sumPeach(int i) {

        if (i == 10) {
            return 1;
        } else {
            return sumPeach(i + 1) * 2 + 2;
        }
    }
}
