package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*15.5
 Korzystając z operatora odejmowania (–), napisz program obliczający resztę z dzielenia pary liczb naturalnych.*/
public class RestOfDivisionOfNumbers {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            int a, b;

            do {
                try {
                    System.out.print("Please, insert two natural positive numbers,\na = ");
                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("This isn't positive natural number.Please, try again.");
                    a = -1;
                    b = -1;
                }
                System.out.printf("Rest of division %d by %d is ", a, b);
                while (a >= b) {
                    a -= b;
                }
                System.out.println(a + ".");
            } while ((b <= 0) || (a <= 0));
        }
    }

}
