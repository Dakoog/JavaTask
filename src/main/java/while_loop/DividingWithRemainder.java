package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividingWithRemainder {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\tDIVIDING WITH REMAINDER.");
        try (InputStreamReader input = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(input)) {

        int a, b, quotient = 0;
        do {
            try {
                System.out.print("\nPlease, insert two natural positive numbers,\na = ");
                a = Integer.parseInt(br.readLine());
                System.out.print("b = ");
                b = Integer.parseInt(br.readLine());


            } catch (NumberFormatException nfe) {
                a = -1;
                b = -1;
            }
        } while (a <= 0 || b <= 0);
        System.out.printf("%d : %d = ", a, b);

        int x = a;
        while (x >= b) {
            x -= b;
            quotient++;
        }
        int r = a - b * quotient;
        if (r != 0) {
                System.out.println(quotient + " r. " + r);
        } else {
            System.out.println(quotient);
        }
    }
}
}


