package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*14.1.
Użytkownik wprowadza z klawiatury serię liczb różnych od zera, zero natomiast jest
sygnałem zakończenia wprowadzania danych. Napisz program, który obliczy sumę tych liczb.
*/
public class SumOfNumbers {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please, insert any numbers. When you want to quit, you type 0.");
        double number;
        double sum = 0;
        do {
            System.out.print("x = ");
            number = Double.parseDouble(br.readLine());
            sum += number;
        } while (number != 0);
        input.close();
        System.out.println("The sum of the given numbers is " + sum);

        input.close();
    }
}
