package inputOutput.stringFormat;

import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        Date today = new Date();// sobota, 09.07.2022r
        // %tA(full) and %ta(abbreviated) -> day of week
        System.out.printf("%TA %n", today); // SOBOTA
        System.out.printf("%TA %n", today); // sobota
        System.out.printf("%ta %n", today); // sob.
        // %tB(full) and %tb[%th](abbreviated) -> month name
        System.out.printf("%tB %n", today); // lipca
        System.out.printf("%tb %n", today); // lip
        // %tm - month in digital notation
        System.out.printf("%tm %n", today);
        // %tY(full) and %ty(two last) -> year
        System.out.printf("%tY %n", today); // 2022
        System.out.printf("%ty %n", today); // 22
        // %td(full) and %ty(without zero) -> day of month
        System.out.printf("%td %n", today); // 09
        System.out.printf("%te %n", today); // 9
        // %tj - day of year
        System.out.printf("Today is %tj day of %tY year.%n", today, today);
        // today is:
        System.out.printf("Today is %tA, %td %tB %tY. %tj day of year. %n", today, today, today, today, today);
        // or %tc - date and time formatted
        System.out.printf("%tc. %tj day of year. %n", today, today);
        // or
        System.out.printf("%tA, %td-%tm-%tY %n", today, today, today, today);
        // %tH(system 24-hours)  and %tI(system 12-hours) - hour
        System.out.printf("%tH %n", today);// 11
        System.out.printf("%tI%tp  %n", today, today);// 11
        // %tM - minutes
        System.out.printf("%tM %n", today);
        //%ts - seconds
        System.out.printf("%tS %n", today);
        //currently time
        System.out.printf("Currently time it is %tH:%tM:%tS %n", today, today, today);
        //or 12-hours formatted
        System.out.printf("Currently time it is %tI:%tM:%tS%Tp %n", today, today, today, today);
        //or
        System.out.printf("%tr %n",today);
        //or
        System.out.printf("Currently it is %tT %n", today);
        // or (only hours and minutes)
        System.out.printf("%tR %n",today);




    }
}
