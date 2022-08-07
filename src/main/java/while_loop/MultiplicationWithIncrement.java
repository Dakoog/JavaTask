package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationWithIncrement {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            int a, b;
            boolean end = false;
            while (!end) {
                try {
                    System.out.print("Please, insert two integers,\n" +
                            "a = ");
                    a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    b = Integer.parseInt(br.readLine());
                    if (b >= 0) {
                        System.out.printf("%d x %d = ", a, b);
                    } else {
                        System.out.printf("%d x (%d) = ", a, b);
                    }
                    System.out.println(multiplicationOfInteger(a,b));
                    end = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("You typed incorrect numbers.Please, try again");
                }
            }
        }
    }
    private static int multiplicationOfInteger(int a, int b) {

        int product = 0;
        int sign;

        if (a != 0 && b != 0) {
            if (a > 0)
                sign = 1;
            else {
                sign = -1;
                a = -a;
            }
            if (b < 0) {
                sign = -sign;
                b = -b;
            }

            do {
                a--;
                product += b;

            }
            while (a != 0);
            if (sign == -1) {
                product = -product;
            }
        }
        return product;
    }
}
