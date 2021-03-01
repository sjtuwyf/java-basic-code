package object.date.calender.stringbuilder;

public class StringBuilder03 {
    public static void main(String[] args) {
        SbTest();
    }

    private static void SbTest() {
        String s = "789";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < s.length(); i1++) {
                sb.append(s.charAt(i1));
            }

            if (i != 2) {
                sb.append(" ");
            }

            s = s.substring(1).concat(s.substring(0, 1));
        }
        s = sb.toString() + " " + sb.reverse().toString();
        System.out.println(s);
    }
}
