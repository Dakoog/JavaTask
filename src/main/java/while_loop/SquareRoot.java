package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*15.6.
Napisz program obliczający całkowity pierwiastek kwadratowy z podanej liczby naturalnej.
Nie korzystaj przy tym z funkcji bibliotecznych oraz innych metod przybliżonego
obliczania pierwiastka kwadratowego i zaokrąglenia otrzymanego wyniku zmiennoprzecinkowegodo liczby całkowitej.*/
public class SquareRoot {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {

            int n;

            do {
                System.out.print("Please, insert natural positive numbers, n = ");

                try {
                    n = Integer.parseInt(br.readLine());
                } catch (NumberFormatException nfe) {
                    n = -1;
                }


                int p = 0;
                while (p * p <= n) {
                    p++;
                }
                --p;// correction of the result
                System.out.printf("Total square root with number %d is %d", n, (p));
            } while (n < 0);

        }
    }
}
