package fractions.tasks;

import fractions.Fraction;
import fractions.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Korzystając z obiektów i metod klasy Fraction oblicz sumy następujących szeregów liczbowych:
a) a1 = 1, a2 = 1 + 1/1, a3 = 1 + 1/(1+ 1/1),...
b) a1 = 1, a2 = 1/2, a3 = 1/4,...
c) a1 = 1, a2 = -1/2, a3 = 1/4,...
 */
public class SumOfGeometricSeries {

    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.println("Calculate sum of geometric series.");
            System.out.println("Given is geometric series: a1, a2, a3 ....");

            boolean finish = false;

            do {
                try {
                    System.out.print("Please, insert  its terms: \na1 = ");

                    Fraction a1 = Utils.inputFraction(br);
                    System.out.print("a2 = ");
                    Fraction a2 = Utils.inputFraction(br);
                    System.out.print("a3 = ");
                    Fraction a3 = Utils.inputFraction(br);
                    Fraction q = a2.divisionFractions(a1);
                    Fraction sum = a1.divisionFractions(q.subtractionFromInteger(1));

                    Fraction b = new Fraction(1);
                    Fraction absolutOfQuotient = q.abs();
                    if (!a2.divisionFractions(a1).equals(a3.divisionFractions(a2)) || absolutOfQuotient.isUpper(b)) {
                        System.out.println("This isn't geometric series ");
                    } else {

                        System.out.printf("Sum of geometric series: %s, %s, %s ... is S = %s.", a1, a2, a3, sum.mixedNumber());
                    }


                    finish = true;

                } catch (NumberFormatException nfe) {
                    System.out.println("You put wrong data. Try again.");
                }
            } while (!finish);
        }
    }
}


