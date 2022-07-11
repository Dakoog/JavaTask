package inputOutput.tasks;


import static java.lang.System.*;
import static java.lang.Math.*;

/*10.2 Wyświetl w konsoli z dokładnością do 10 miejsc po przecinku następujące liczby niewymierne: π, e, φ (  (liczba Fibonacciego). Liczby poprzed	 komentarzem sownym
i ustaw w kolumnie wyrównanej do prawej strony. */
 /*annotation: values for numbers
   π =
   e =
   φ =
    */
public class SecondTask {
    public static void main(String[] args) {
        double φ = (1 + sqrt(5.0)) / 2;
        double π = PI;
        double e = E; // Math class was imported


        out.printf("π = %.10f%n" , π);
        out.printf("e = %.10f%n" , e);
        out.printf("φ = %.10f%n" , φ);


    }

}
