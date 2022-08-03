package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationWithIncrement {
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
            int product = 0;

            if (a == 0) {
                System.out.printf("%d x %d = %d. %n", a, b, product);
            } else if (a < 0) {
                if (b < 0) {
                    System.out.printf("%d x (%d) = ", a, b);
                } else {
                    System.out.printf("%d x %d = ", a, b);
                }

                do {
                    a++;
                    product -= b;

                }
                while (a != 0);
                System.out.println(product);

            } else {
                if (b < 0) {
                    System.out.printf("%d x (%d) = ", a, b);
                } else {
                    System.out.printf("%d x %d = ", a, b);
                }
                do {
                    a--;
                    product += b;

                } while (a != 0);
                System.out.println(product);
            }


        }
    }
}
