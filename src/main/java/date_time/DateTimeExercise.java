package date_time;

import inputOutput.stringFormat.Calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExercise {
    public static void main(String[] args) {
        // 1. Napisz program, który odczyta jaka dzień tygodnia był
        // a) w setną rocznicę bitwy pod Grunwaldem (15.07.1410 - bitwa }
        LocalDate battleOfGrunwald = LocalDate.parse("1410-07-15");
        System.out.printf("Battle of Grunwald (%1$s) was %1$tA. %n",battleOfGrunwald);
        System.out.printf("100 years letter was %1$tA. %n",battleOfGrunwald.plusYears(100));
        //b) 175 dni i 23 godziny po twoich urodzinach
        LocalDateTime myBirthday = LocalDateTime.parse("1968-11-26T15:15:13");
        System.out.printf("Then it was %tA %n",myBirthday.plusHours(13).plusDays(175));
        //2.oblicz ile lat miesięcy i dni minęło od zakończenia I wojny światowej do rozpoczęcia || wojny światowej
        LocalDate firstWorldWarEnding = LocalDate.parse("1918-11-11");
        LocalDate secondWorldWarStarting = LocalDate.parse("1939-09-01");
        long diff = ChronoUnit.SECONDS.between(secondWorldWarStarting,firstWorldWarEnding);
        System.out.println(diff);



    }
}
