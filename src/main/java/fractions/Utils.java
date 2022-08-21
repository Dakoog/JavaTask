package fractions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    public static int GCD(int a, int b) {
        int p;

        while (b != 0) {
            p = a % b;
            a = b;
            b = p;
        }

        return a < 0 ? -a : a;
    }
    public static Fraction determinantForSystemOfLinearEquations(Fraction a, Fraction b, Fraction c, Fraction d) {
        return a.multiplyFractions(d).subtractionFractions(b.multiplyFractions(c));
    }
    public static Fraction inputFraction(BufferedReader br) throws IOException {
        return new Fraction(br.readLine());
    }
}
