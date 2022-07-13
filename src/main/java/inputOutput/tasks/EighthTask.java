package inputOutput.tasks;
/* 10.8. Oblicz kąty ostre w trójkącie egipskim (trójkącie prostokątnym o proporcji boków 3:4:5). Wyniki podaj:
a) w radianach, z dokładnością do 4 miejsc po przecinku,
b) w stopniach, z dokładnością do 1 miejsca po przecinku,
c) w stopniach i minutach kątowych, z dokładnością do 1',
d) w stopniach, minutach i sekundach kątowych z dokładnością do 1".*/

import static java.lang.System.*;
import static java.lang.Math.*;

public class EighthTask {
    public static void main(String[] args) {
        double a, b, c, alfa, beta, α, β;
        int αMinutes, βMinutes, αSeconds, βSeconds;

        // sides of triangle: a, b, c,
        a = 3.0;
        b = 4.0;
        c = 5.0;
        // acute angles of triangle α , β
        // in radians
        α = asin(a / c);
        β = asin(b / c);
        // in degrees
        alfa = toDegrees(α);
        beta = toDegrees(β);
        αMinutes = (int) ((alfa - (int) toDegrees(α)) * 60 + 0.5);
        βMinutes = (int) ((beta - (int) toDegrees(β)) * 60 + 0.5);

        out.println("The acute angles (α , β) in the Pythagorean triangle:");

        //a) in radians to 4 decimal places
        out.printf("a) these angles in radians:" +
                " %nα = %.4f rad, β = %.4f rad %n", α, β);

        //b) in degrees to 1 decimal places
        out.printf("b) these angles in degrees with an accuracy of 0.1 :" +
                " %nα = %.1f \u00B0, β = %.1f \u00B0 %n", toDegrees(α), toDegrees(β));

        //c)in degrees and arc minutes, with an accuracy of 1',
        out.printf("c) these angles in degrees and minutes" +
                " %nα = %d\u00B0%d', β = %d\u00B0%d'%n", (int) toDegrees(α), αMinutes, (int) toDegrees(β), βMinutes);

        // d) in degrees, minutes and arc seconds with an accuracy of 1"
        αMinutes = (int) ((alfa - (int) toDegrees(α)) * 60);
        βMinutes = (int) ((beta - (int) toDegrees(β)) * 60);
        αSeconds = (int) ((alfa - (int) alfa - αMinutes / 60.0) * 3600.0 + 0.5);
        βSeconds = (int) ((beta - (int) beta - βMinutes / 60.0) * 3600.0 + 0.5);
        out.printf("d) these angles in degrees, minutes and seconds" +
                " %nα = %d\u00B0%d'%d\", β = %d\u00B0%d'%d\"%n", (int) toDegrees(α), αMinutes, αSeconds, (int) toDegrees(β), βMinutes, βSeconds);


    }
}
