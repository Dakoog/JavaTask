package fractions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static Fraction inputFraction(BufferedReader br) throws IOException {

        do {
            System.out.println("""
                    if you insert:
                    mixed number - type 1,
                    fraction - type 2.""");
            try {
                int select = Integer.parseInt(br.readLine());

                if (select == 2) {
                    System.out.print("a = ");
                    int a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    int b = Integer.parseInt(br.readLine());
                    return new Fraction(a, b);

                } else if (select == 1) {
                    System.out.print("enter the whole of mixed number:\nn = ");
                    int n = Integer.parseInt(br.readLine());

                    System.out.print("next insert fraction\na = ");
                    int a = Integer.parseInt(br.readLine());
                    System.out.print("b = ");
                    int b = Integer.parseInt(br.readLine());
                    Fraction x = new Fraction(a, b);

                    return x.changeToImproperFraction(n, x);
                }

            } catch (NumberFormatException nfe) {
                //
            }

        } while (true);
    }
}
