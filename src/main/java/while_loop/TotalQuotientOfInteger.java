package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*15.4.
Korzystając z operatora odejmowania (–), napisz program obliczający iloraz wraz z resztą (jeśli nie jest podzielny)
pary liczb całkowitych.

*/
public class TotalQuotientOfInteger {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.println("\n\t\t\tTOTAL QUOTIENT.");
            int a, b;
            boolean end = false;
            do {
                try {
                    System.out.print("\nPlease, insert two integer numbers,\na = ");
                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());

                    System.out.printf("%d : %d = ", a, b);

                    System.out.println(totalQuotient(a, b));
                    end = true;

                } catch (NumberFormatException | ArithmeticException nfe) {
                    System.out.println(nfe.getMessage());
                }

            } while (!end);
        }

    }

    public static int totalQuotient(int a, int b) throws ArithmeticException {
        int sing = 1, quotient = 0;
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        } else {
            if (a < 0) {
                sing = -1;
                a = -a;
            }
            if (b < 0) {
                sing = -1;
                b = -b;
            }
            while (a >= b) {
                a -= b;
                quotient++;
            }
            if (sing == -1) {
                quotient = -quotient;
            }

        }
        return quotient;
    }
}
