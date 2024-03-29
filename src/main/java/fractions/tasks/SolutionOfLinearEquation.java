package fractions.tasks;

import fractions.Fraction;
import fractions.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionOfLinearEquation {
    private static final Fraction ZERO = new Fraction();

    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.println("Solution of linear equation of type: ax + b = 0.");
    boolean finish = false;

            do {
        try {

            System.out.print("Please, insert its factors: \na = ");
            Fraction a = Utils.inputFraction(br);
            System.out.print("b = ");
            Fraction b = Utils.inputFraction(br);

            if (!a.equals(ZERO)) {
                Fraction solution = b.divisionFractions(a).multiplyFractions(-1).reducingFraction();

                System.out.printf("Solution of %sx + %s = 0 is x = %s. ", a, b, solution.mixedNumber());

            } else if (b.equals(ZERO)) {
                System.out.printf("Equation %sx + %s = 0 is identity. Its solution is the set of all real numbers.", a, b);
            } else {

                System.out.printf("Equation %sx + %s = 0 is a contradictory . Its solution is an empty set.", a, b);
            }
            finish = true;

        } catch (NumberFormatException nfe) {
            System.out.println("You put wrong data. Try again.");
        }
    } while (!finish);




        }
    }
}

