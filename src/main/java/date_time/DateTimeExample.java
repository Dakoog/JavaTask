package date_time;

import java.io.File;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeExample {
    public static void main(String[] args) throws IOException {

        System.out.println("\n\t********************* TIME TODAY *****************************\n");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();
        System.out.println("Today is: " + localDate + "\n" +
                "time: " + localTime + "\n" +
                "today (date and time): " + localDateTime + "\n" +
                "date and time (without time zones): " + instant + "\n"
        );

        System.out.println("\n\t********************* TIME ZONES IN THE WORLD *****************************\n");
        File timeZones = new File("timeZonesInWorld.txt");
        Scanner input = new Scanner(timeZones);
        while (input.hasNext()) {
            String timeZonesContent = input.nextLine();
            System.out.println(timeZonesContent);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease, enter your time zone if you want to check what time it is there. Your zone it: ");
        String zones = scanner.nextLine();
        System.out.println();
        Clock clock = Clock.system(ZoneId.of(zones)); // can change time zones
        LocalDateTime localDateTimeZone = LocalDateTime.now(clock);
        LocalDate localDateZone = LocalDate.now(clock);
        LocalTime localTimeZone = LocalTime.now(clock);
        Instant instantZone = Instant.now(clock);
        System.out.println(
                "Today is: " + localDateZone + "\n" +
                        "time: " + localTimeZone + "\n" +
                        "today (date and time): " + localDateTimeZone + "\n" +
                        "date and time (without time zones): " + instantZone + "\n"
        );

        System.out.println("\n\t*************** YOUR DATE AND TIME *******************");
        LocalDate myMumBirthday = LocalDate.of(1947, 10, 22);
        LocalTime myBirthday = LocalTime.of(15, 15, 26);
        LocalDateTime myDaughterBirthday = LocalDateTime.of(2008, 11, 15, 7, 25, 3);

        System.out.println("My mum birthday it is " + myMumBirthday);
        System.out.printf("I was birth at %tr o'clock %n", myBirthday);
        System.out.printf("My daughter was birth on %1$tA, %1$td %1$tB %1$tY at %1$tr o'clock. %n", myDaughterBirthday);
        // by string -> parse
        System.out.print("\nPlease, insert your birthday (in convention yyyy-MM-dd): ");
        String myDate = scanner.nextLine();
        LocalDate mybirthDay = LocalDate.parse(myDate);
        System.out.printf("You ware birth on %tA %n",mybirthDay);

        System.out.print("\nPlease, insert your the time of the meeting (in convention HH:mm:ss): ");
        myDate = scanner.nextLine();
        LocalTime myMeeting = LocalTime.parse(myDate);
        System.out.printf("You have an appointment for an hour at %tr o'clock. %n",myMeeting);

        System.out.print("\nPlease, give date for World War II (in convention yyyy-MM-ddTHH:mm:ss): ");
        myDate = scanner.nextLine();
        LocalDateTime secondWorldWarStarted = LocalDateTime.parse(myDate);
        System.out.println("World War II began on "+ secondWorldWarStarted);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("I was born "+myFormat.format(mybirthDay));
        input.close();
        scanner.close();



}}
