package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*14.4
Napisz program obliczający pole powierzchni koła. Promień koła użytkownik wprowadza z klawiatury.
Program powinien zasygnalizować błędne dane (liczba niedodatnia) i ponownie zapytać o długość promienia.*/
public class AreaOfCircle {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\tCALCULATE AREA OF CIRCLE");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert radius of circle, r = ");
        double r;

        do {
            try {
                r = Double.parseDouble(br.readLine());
                if (r <= 0) {
                    System.err.print("Remember, that this is positive, so r = ");
                }
            } catch (NumberFormatException nfe) {
                System.err.print("Remember, that this is positive, so r = ");
                r = -1;
            }
        } while (r <= 0);

        double areaOfCircle = Math.PI * r * r;
        System.out.printf("Area of circle with radius r = %.1f is %.2f[j]^2", r, areaOfCircle);

        input.close();
    }
}
