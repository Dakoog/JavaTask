package date_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*3.12
 Napisz program, który sprawdzi poprawność daty z obecnego wieku, zapisanej w postaci dd.mm.rrrr
         i wyświetli odpowiedni komunikat.
*/
public class DateOfTwentyFirstCentury {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert your date in notation (dd.mm.rrrr). Your date: ");

        String yourDate = br.readLine();

        char dot = '.';
        boolean isDate =( yourDate.length() == 10) && (yourDate.charAt(2) == dot && yourDate.charAt(5) == dot);

       try {
        if (isDate) {
            int day = Integer.parseInt(yourDate.substring(0, 2));
            int month = Integer.parseInt(yourDate.substring(3, 5));
            int year = Integer.parseInt(yourDate.substring(6, 10));

            isDate =   year > 2000 && year <= 2100
                    && month >= 1 && month <= 12
                    && day > 0 && day <= 31;

            switch (month) {
                case 2 -> {
                    if (year % 4 == 0)
                        isDate = isDate && day <= 29;
                    else
                        isDate = isDate && day <= 28;
                }
                case 4, 6, 9, 11 -> isDate = isDate && day <= 30;
                default -> {
                }
            }
        }}catch (NumberFormatException nfe){
           isDate = false;
       }


        if (isDate)
            System.out.println(yourDate + " - is correct");
        else
            System.out.println(yourDate + " - is incorrect");

    }


}
