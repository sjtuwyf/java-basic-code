package object.date.calender.stringbuilder;

public class ArraycopyTest {
    public static void main(String[] args) {
        char[] cha = {'i','t','c','a','s','a'};

        System.arraycopy(cha, 1, cha, 5, 1);

        for (int i = 0; i < cha.length; i++) {
            System.out.print(cha[i]);
        }
    }

}
