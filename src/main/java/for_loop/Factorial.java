package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {

            String text;
            do {
                try {
                    System.out.print("Please, insert natural numbers, n = ");

                    int n = Integer.parseInt(br.readLine());
                    if (n == 0) {
                        System.out.println();
                    }
                    if (n < 0) {
                        text = "This is negative number. Try again.";
                        System.out.println(text);
                    } else {
                        int factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;

                        }
                        text = "ok";
                        System.out.printf("%d! = %d ", n, factorial);

                    }
                } catch (NumberFormatException nfe) {
                    text = "This isn't natural number. Try again. ";
                    System.out.println(text);
                }


            } while (!text.equals("ok"));


        }

    }


}
