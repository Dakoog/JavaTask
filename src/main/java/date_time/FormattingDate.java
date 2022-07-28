package date_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*13.13 Napisz program, który datę podaną w postaci dd.mm.rrrr zapisze w formacie rrrr-mm-
-dd. Sprawdź, czy wprowadzana data jest poprawna*/
public class FormattingDate {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert your date in notation (dd.MM.yyyy). Your date: ");
        String yourDate = br.readLine();
        if(ValidationOfDate.isDate(yourDate)){
            DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(yourDate, newFormat);
            System.out.println(yourDate+ " replace to " + date);
    }
}}
