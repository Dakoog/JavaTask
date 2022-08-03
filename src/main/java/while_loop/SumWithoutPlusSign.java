package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*15.1
 Użytkownik wprowadza z klawiatury dwie liczby naturalne. Nie korzystając z operatora dodawania (+), oblicz sum tych liczb. Napisz program obliczajcy sum tych
 liczb, mając do dyspozycji operatory inkrementacji (++) i dekrementacji (––).
 */
public class SumWithoutPlusSign {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            int a, b;

            do {

                try {
                    System.out.print("Please, insert two positive natural numbers, a = ");
                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());


                } catch (NumberFormatException nfe) {

                    a = -1;
                    b = -1;
                }

            } while (a <= 0 || b <= 0);


            System.out.printf("%d + %d = ", a, b);
            while (a != 0) {
                a--;
                b++;
            }

            System.out.println(b+".");

        }
    }
}
