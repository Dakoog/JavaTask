package fractions.tasks;

import fractions.Fraction;
import fractions.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*20.26
    Napisz program rozwiązujący metodą wyznaczników układ dwóch równań liniowych
 z dwiema niewiadomymi w zbiorze liczb wymiernych. Wykorzystaj obiekty i metody
 klasy Fraction. Utwórz metodę det(), która będzie obliczać wyznacznik, oraz metodę
 inputFraction(), do wprowadzania z klawiatury wartości obiektów klasy Fraction.
 */
public class SystemOfLinearEquations {
    private static final Fraction ZERO = new Fraction();

    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {

            System.out.println("Solving systems of Linear Equations:");
            System.out.println("     a1x + b1y = c1");
            System.out.println("     a2x + b2y = c2");

            boolean finish = false;

            do {
                try {
                    // insert data
                    System.out.print("Please insert the appropriate factors of the system of equations:\n" +
                            "a1 = ");
                    Fraction a1 = Utils.inputFraction(br);
                    System.out.print("b1 = ");
                    Fraction b1 = Utils.inputFraction(br);
                    System.out.print("c1 = ");
                    Fraction c1 = Utils.inputFraction(br);
                    System.out.print("a2 = ");
                    Fraction a2 = Utils.inputFraction(br);
                    System.out.print("b2 = ");
                    Fraction b2 = Utils.inputFraction(br);
                    System.out.print("c2 = ");
                    Fraction c2 = Utils.inputFraction(br);

                    // calculate determinants
                    Fraction w = Utils.determinantForSystemOfLinearEquations(a1, b1, a2, b2);
                    Fraction wX = Utils.determinantForSystemOfLinearEquations(c1, b1, c2, b2);
                    Fraction wY = Utils.determinantForSystemOfLinearEquations(a1, c1, a2, c2);

                    // type of systems of linear equations
                    System.out.println();
                    if (!w.equals(ZERO)) {
                        // solution
                        Fraction x = wX.divisionFractions(w).reducingFraction();
                        Fraction y = wY.divisionFractions(w).reducingFraction();
                        String x1 = x.mixedNumber();
                        String y1 = y.mixedNumber();

                        System.out.println("Solution of system linear equations:");
                        System.out.printf("     %sx + %sy = %s %n", a1, b1, c1);
                        System.out.printf("     %sx + %sy = %s %n", a2, b2, c2);
                        System.out.printf("Solution is: x = %s, y = %s ", x1, y1);
                    } else if (!wX.equals(ZERO) || !wY.equals(ZERO)) {
                        System.out.println("Solution of system linear equations:");
                        System.out.printf("     %sx + %sy = %s %n", a1, b1, c1);
                        System.out.printf("     %sx + %sy = %s %n", a2, b2, c2);
                        System.out.println("It's system of linear contradictory equations.  Its solution is an empty set.");

                    } else {
                        System.out.println("Solution of system linear equations:");
                        System.out.printf("     %sx + %sy = %s %n", a1, b1, c1);
                        System.out.printf("     %sx + %sy = %s %n", a2, b2, c2);
                        System.out.println("It's system of identity equations. Its solution is the set of all real numbers.");
                    }
                    finish = true;
                    // exception
                } catch (NumberFormatException nfe) {
                    System.out.println("You insert wrong data. Try again");
                }
            } while (!finish);

        }
    }


}

