package object.date.calender.stringbuilder;

public class StringBuilder02 {

    public static void main(String[] args) {
        String[] str ={"010","323","666","123123","1514"};

        SbTest(str);
    }

    private static void SbTest(String[] str) {
        int count =0;
        for (String s : str) {
            StringBuilder builder = new StringBuilder(s);
            if (builder.reverse().toString().equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }

}
