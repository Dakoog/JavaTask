package date_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 13.15
// Napisz program, który na podstawie podanej przez użytkownika daty wyliczy, jaki to dzień tygodnia (skorzystaj ze wzoru Zellera)
public class DayOfWeek {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert your date in notation (dd.MM.yyyy). Your date: ");
        String yourDate = br.readLine();
        input.close();
        int dayOfWeek, m, d, y, z, c;

        m = Integer.parseInt(yourDate.substring(3, 5));
        d = Integer.parseInt(yourDate.substring(0, 2));
        y = Integer.parseInt(yourDate.substring(6, 10));
        z = (m < 3) ? (y - 1) : y;
        c = (m < 3) ? 0 : 2;
        dayOfWeek = (23 * m / 9 + d + 4 + y + z / 4 - z / 100 + z / 400 - c) % 7;

        switch (dayOfWeek) {
            case 0 -> System.out.println(yourDate + " was Sunday.");
            case 1 -> System.out.println(yourDate + " was Monday.");
            case 2 -> System.out.println(yourDate + " was Tuesday. ");
            case 3 -> System.out.println(yourDate + " was Wednesday.");
            case 4 -> System.out.println(yourDate + " was Thursday");
            case 5 -> System.out.println(yourDate + " was Friday.");
            case 6 -> System.out.println(yourDate + " was Saturday.");
        }
    }
}


