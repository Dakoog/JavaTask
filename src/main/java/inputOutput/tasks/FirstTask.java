package inputOutput.tasks;

import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

/*10.1 Przedstaw ułamek 4/7 z dokładnością do 5 miejsc po przecinku.*/
public class FirstTask {
    public static void main(String[] args) {
        double x = 4/7d;
        System.out.printf("4/7 = %.5f\n",x);
        Date today = new Date();
        System.out.printf("%tA ",today);
    }
}
