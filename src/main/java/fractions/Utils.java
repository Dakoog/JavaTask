package fractions;

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
}
