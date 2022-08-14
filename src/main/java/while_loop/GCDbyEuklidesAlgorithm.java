package while_loop;

import fractions.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Korzystając z algorytmu Euklidesa,
napisz program wyznaczający największy wspólny dzielnik (NWD) pary liczb naturalnych dodatnich
.*/
public class GCDbyEuklidesAlgorithm {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {

            int a, b;
         boolean finish;

            do {
                try {
                    System.out.print("Please, insert two positive natural numbers.\na = ");
                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());
                    System.out.printf("GCD (%d, %d) = %d. ", a, b, Utils.GCD(a, b));
                    finish = true;
                } catch (NumberFormatException nfe) {
                    finish = false;
                    System.out.println("This isn't positive natural number.Please, try again.");
                }
            } while (!finish);
        }

    }
}

