package date_time;
/*Napisz program, który datę podaną w formacie dd.MM.yyyy zapisze w postaci tradycyjnej:
a) z miesiącem zapisanym słownie, np. 15 marca 2012;
b) z miesiącem zapisanym w systemie rzymskim, np. 15 III 2012.
Przyjmij, że wprowadzona przez użytkownika data jest poprawna.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateNotationWithDifferentMonths {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert your date in notation (dd.MM.yyyy). Your date: ");
        String yourDate = br.readLine();
        System.out.println("a) Date with the word notation of the month");
        dateWithWordNotationOfMonth(yourDate);
        System.out.println("b) Date with the Roman notation of the month");
        dateWithRomanNotationOfMonth(yourDate);


    }

    private static void dateWithWordNotationOfMonth(String yourDate) {
        if (ValidationOfDate.isDate(yourDate)) {
            StringBuilder formattedDate = new StringBuilder(yourDate);
            formattedDate.replace(2, 3, " ").replace(5, 6, " ");
            int month = Integer.parseInt(formattedDate.substring(3, 5));
            switch (month) {
                case 1 -> formattedDate.replace(3, 5, "January");
                case 2 -> formattedDate.replace(3, 5, "February");
                case 3 -> formattedDate.replace(3, 5, "March");
                case 4 -> formattedDate.replace(3, 5, "April");
                case 5 -> formattedDate.replace(3, 5, "May");
                case 6 -> formattedDate.replace(3, 5, "June");
                case 7 -> formattedDate.replace(3, 5, "July");
                case 8 -> formattedDate.replace(3, 5, "August");
                case 9 -> formattedDate.replace(3, 5, "September");
                case 10 -> formattedDate.replace(3, 5, "October");
                case 11 -> formattedDate.replace(3, 5, "November");
                case 12 -> formattedDate.replace(3, 5, "December");
            }
            System.out.println(formattedDate);
        } else {
            System.out.println(yourDate + " is incorrect");
        }
    }

    private static void dateWithRomanNotationOfMonth(String yourDate) {
        if (ValidationOfDate.isDate(yourDate)) {
            StringBuilder formattedDate = new StringBuilder(yourDate);
            formattedDate.replace(2, 3, " ").replace(5, 6, " ");
            int month = Integer.parseInt(formattedDate.substring(3, 5));
            switch (month) {
                case 1 -> formattedDate.replace(3, 5, "I");
                case 2 -> formattedDate.replace(3, 5, "II");
                case 3 -> formattedDate.replace(3, 5, "III");
                case 4 -> formattedDate.replace(3, 5, "IV");
                case 5 -> formattedDate.replace(3, 5, "V");
                case 6 -> formattedDate.replace(3, 5, "VI");
                case 7 -> formattedDate.replace(3, 5, "VII");
                case 8 -> formattedDate.replace(3, 5, "VIII");
                case 9 -> formattedDate.replace(3, 5, "IX");
                case 10 -> formattedDate.replace(3, 5, "X");
                case 11 -> formattedDate.replace(3, 5, "XI");
                case 12 -> formattedDate.replace(3, 5, "XII");
            }
            System.out.println(formattedDate);
        } else {
            System.out.println(yourDate + " is incorrect");
        }
    }
}
