package inputOutput.dateTime;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {

    public static void main(String[] args) {
        Date currently = new Date(); // today 09.07.2021
        System.out.printf("Today is %tc%n", currently);
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("Today is %tc%n",today);
        GregorianCalendar secondWorldWar = new GregorianCalendar(1939, Calendar.SEPTEMBER,1);
        System.out.println(secondWorldWar);
    }

}
