package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {
    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            int a,b;
            String text = "ok";
            do {
                try { System.out.print("Please, insert two positive natural numbers.\na = ");

                     a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                     b = Integer.parseInt(br.readLine());
                     if(a<=0 || b<=0){
                         text = "Given number is(numbers are) negative. ";
                         System.out.println(text);
                     }else {
                        System.out.printf("LCM (%d , %d) = ", a, b);
                        int lcm;
                        if (a > b) {
                            lcm = a;

                            while (lcm % b != 0) {
                                lcm += a;
                            }
                        } else {
                            lcm = b;

                            while (lcm % a != 0) {
                                lcm += b;
                            }

                        }
                         System.out.println(lcm);
                    }

                } catch (NumberFormatException nfe) {
                    text = "This isn't positive natural number.Please, try again.";
                    System.out.println(text);

                }

                }while (!text.equals("ok"));

            }

    }
}
