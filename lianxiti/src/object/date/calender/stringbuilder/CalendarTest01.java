package object.date.calender.stringbuilder;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, 14);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DAY_OF_MONTH);

        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year+" "+month+" "+date+" "+week);


    }

    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
