package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Zadanie 14.5.
Napisz program obliczający pole powierzchni pierscienia kołowego o promieniu zewnetrznym R i wewnetrznym r. Dlugosci promieni uzytkownik wprowadza z klawiatury.
Program powinien zasygnalizowac bledne dane i ponownie zapytac o potrzebne
wartosci.*/
public class CircularRingArea {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert radius of radius of the outer circle R, and radius of inner circle r.  ");
        double R = 0, r;
        do {
            try {
                R = Double.parseDouble(br.readLine());
                r = Double.parseDouble(br.readLine());
                if (r >= R || r <= 0) {
                    System.out.println("Remember, that radius this is positive number and r < R");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Remember, that radius this is positive number and r < R");
                r = -1;
            }

        } while (r >= R || r <= 0);
        double ringCircularArea = Math.PI * (R * R - r * r);
        System.out.printf("Ring circular area for r = %.1f and R = %.1f is %.2f[j]^2", r, R, ringCircularArea);
    }
}
