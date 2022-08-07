package while_loop.for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*16.1.
Napisz program, który nie wykonując mnożenia, obliczy kwadrat liczby naturalnej.*/
public class SquareNumber {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            String text = "ok";
            do {
                try {

                    System.out.print("Please, insert natural number, n = ");
                    int n = Integer.parseInt(br.readLine());
                    int squareNumber = 0;
                    int noPairNumber = 1;
                    if (n < 0) {
                        text = "Given number is negative.Try again";
                        System.out.println(text);
                    } else {
                        for (int i = 0; i < n; i++) {
                            squareNumber += noPairNumber;
                            noPairNumber += 2;
                        }
                        System.out.printf("%d^2 = %d. %n", n, squareNumber);
                    }

                } catch (NumberFormatException nfe) {
                    text = "Given number isn't natural.Try again.";
                    System.out.println(text);
                }
            } while (!text.equals("ok"));

        }
    }
}
