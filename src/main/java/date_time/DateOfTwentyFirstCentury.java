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


        if (ValidationOfDate.isDate(yourDate))
            System.out.println(yourDate + " - is correct");
        else
            System.out.println(yourDate + " - is incorrect");

    }




}
