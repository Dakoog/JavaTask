package while_loop;

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

            int a, b, p;
            String text = "ok";

            do {
                try {
                    System.out.print("Please, insert two positive natural numbers.\na = ");

                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());
                    if (a <= 0 || b <= 0) {
                        text = "Given number is(numbers are) negative. ";
                        System.out.println(text);
                    } else {
                        System.out.printf("GCD (%d, %d) = ", a, b);
                        while (b != 0) {
                            p = a % b;
                            a = b;
                            b = p;
                        }
                        System.out.println(a);
                    }
                } catch (NumberFormatException nfe) {
                    text = "This isn't positive natural number.Please, try again.";
                    System.out.println(text);
                }
            } while (!text.equals("ok"));
        }
    }
}
