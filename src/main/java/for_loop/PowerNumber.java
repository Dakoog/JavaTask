package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*16.8.
Napisz program umożliwiający wielokrotne obliczanie potęg o wykładniku naturalnym n i podstawie rzeczywistej a.
 Nie korzystaj z funkcji klasy Math. Podanie wykładnika –1 powinno przerwać działanie programu
 */
public class PowerNumber {
    public static void main(String[] args) throws IOException {
        try(InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(input)){

            System.out.println("Calculate the power of a real number.");
            int n;

          do{
             try {
                  System.out.print("Please, insert real number (the base of the power), a = ");
                  double a = Double.parseDouble(br.readLine());
                  System.out.print("Next, insert natural  number (exponent), n = ");
                  n = Integer.parseInt(br.readLine());

                  if (n == -1) {
                      System.out.println("The end. See you");
                      break;
                  }

                  if (n < 0) {

                      System.out.println("This isn't natural number. Try again.");
                  } else if (a == 0 && n == 0) {

                      System.out.println("0 ^ 0 - symbol indefinite, not countable. Repeat your entry");
                  } else {
                      System.out.printf("%.1f ^ %d = ", a, n);
                      double power = 1;
                      for (double i = 1; i <= n; i++) {
                          power *= a;
                      }
                      System.out.println(power);
                  }
              }catch (NumberFormatException nfe){
                 System.out.println("This isn't correct numbers. Try again");

             }
          }while (true);


        }
    }

}
