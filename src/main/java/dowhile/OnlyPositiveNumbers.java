package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*14.2.
Podczas wprowadzania danych niejednokrotnie potrzebujemy liczb spełniających określone warunki, np. dodatnich.
Napisz program, który przyjmie z konsoli wyłącznie wartość dodatnią zmiennej. Jeli użytkownik poda liczbę ujemną
lub zero, to program powinien ponowić żądanie podania właściwej wartości.
*/
public class OnlyPositiveNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        double a;


        do {
            System.out.print("Please, insert positive real number, a = ");
            a = Double.parseDouble(br.readLine());

        } while (a <= 0);
        System.out.println("Thank you, " + a + " is positive number.");

        System.out.print("Please, insert natural number , b = ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("\nMultiples of " + b + " less than 100 it: ");
        do {
            System.out.print(b + ", ");
            b += b;

        } while (b < 100);
        System.out.println("\b\b.");

        input.close();
    }
}
