package object.date.calender.stringbuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = df.format(date);
        System.out.println(format);
        System.out.println(date);
    }
}
