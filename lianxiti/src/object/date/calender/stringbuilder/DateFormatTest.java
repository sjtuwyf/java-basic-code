package object.date.calender.stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");

        Date date = df1.parse("2018-03-03");

        SimpleDateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");

        String s = df2.format(date);
        System.out.println(s);
    }
}
