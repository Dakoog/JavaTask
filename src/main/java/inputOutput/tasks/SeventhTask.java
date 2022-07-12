package inputOutput.tasks;
/*10.7.
Wyświetl w konsoli miary kątów 1°, 1' i 1" w radianach z dokładnością do 15 miejsc
po przecinku.*/
import static java.lang.Math.*;
public class SeventhTask {
    public static void main(String[] args) {
        int degree = 1;
        System.out.printf("Convert degrees to radians%n" +
                "1\u00B0 = %.15f rad%n1' = %.15f rad%n1\" = %.15f rad%n ",toRadians(degree),toRadians(degree/60d),toRadians(degree/3600d));
}}
