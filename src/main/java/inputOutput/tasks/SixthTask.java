package inputOutput.tasks;
/* .
10.6 Wyświetl w konsoli miarę kąta o rozwartości 1 radiana w stopniach (z maksymalną
możliwą precyzją), w stopniach i minutach kątowych oraz w stopniach, minutach i sekundach kątowych*/

import static java.lang.Math.*;

public class SixthTask {
    public static void main(String[] args) {
        double degrees = Math.toDegrees(1);
        int dg, min, sec;
        dg = (int) degrees;
        min = (int) ((degrees - dg) * 60 + 0.5);//rounding without using Math.round

        System.out.printf("1 rad = %d\u00B0%2d'%n", dg, min);
        min = (int) ((degrees - dg) * 60);//remove the decimal part and leave only the integer part
        sec = (int) ((degrees - dg - min / 60.0) * 3600 + 0.5);
        System.out.printf("1 rad = %d\u00B0%2d'%2d\"%n", dg, min, sec);


    }
}
