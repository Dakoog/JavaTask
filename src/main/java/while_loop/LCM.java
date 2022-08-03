package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.print("Please, insert two positive natural numbers.\na = ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("b = ");
            int b = Integer.parseInt(br.readLine());
            System.out.printf("LCM (%d , %d) = ", a, b);

            if (a > b) {
                int lcm = a;

                while (lcm % b != 0) {
                    lcm += a;
                }
                System.out.println(lcm);
            } else {
                int lcm = b;

                while (lcm % a != 0) {
                    lcm += b;
                }
                System.out.println(lcm);
            }


        }
    }
}
