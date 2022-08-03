package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*15.2 
Użytkownik wprowadza z klawiatury dwie liczby całkowite. 
Napisz program obliczający sumę tych liczb, korzystając z operatorów: inkrementacji (++) i dekrementacji (--) (*/
public class SumOfTwoIntegerByUsingIncrement {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {

            int a, b;

            try {
                System.out.print("Please, insert two integers,\n" +
                        "a = ");
                a = Integer.parseInt(br.readLine());
                System.out.print("b = ");
                b = Integer.parseInt(br.readLine());
            } catch (NumberFormatException nfe) {
                System.out.print("Please, insert two integers,\n" +
                        "a = ");
                a = Integer.parseInt(br.readLine());
                System.out.print("b = ");
                b = Integer.parseInt(br.readLine());
            }


            if (a == 0) {
                System.out.printf("%d + %d = %d. %n", a, b, b);
            } else if (a < 0) {
                if (b < 0) {
                    System.out.printf("%d %d = ", a, b);
                } else {
                    System.out.printf("%d + %d = ", a, b);
                }

                do {
                    a++;
                    b--;

                }
                while (a != 0);
                System.out.println(b);

            } else {
                if (b < 0) {
                    System.out.printf("%d %d = ", a, b);
                } else {
                    System.out.printf("%d + %d = ", a, b);
                }
                do {
                    a--;
                    b++;

                } while (a != 0);
                System.out.println(b);
            }

        }

    }
}

