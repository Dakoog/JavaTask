package inputOutput.tasks.math;

import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

/*10.1 Przedstaw ułamek 4/7 z dokładnością do 5 miejsc po przecinku.*/
public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Decimal rounding of a fraction 4/7 to five decimal places.");
        double x = 4 / 7d;
        // first solution
        System.out.printf("1. 4/7 = %.5f\n", x);
        // second solution
        double y = Math.round(x * 100000) / 100000.0;
        System.out.println("2. 4/7 = " + y);
        // third solution
        y = (int) (x * 100000 + 0.5) / 100000d;
        System.out.println("3. 4/7 = " + y);
        // fourth solution
        System.out.println(String.format("4. 4/7 = %.5f", x));

    }
}
