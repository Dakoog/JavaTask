package fractions.tasks;

import fractions.Fraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionOfLinearEquation {
    private static final Fraction ZERO = new Fraction();

    public static void main(String[] args) throws IOException {

        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.println("Solution of linear equation of type: ax + b = 0.");


            System.out.print("Please, insert its factors \na = ");
            Fraction a = new Fraction(br.readLine());


            System.out.print("b = ");
            Fraction b = new Fraction(br.readLine());

            if (!a.equals(ZERO)) {
                Fraction solution = b.divisionFractions(a).multiplyFractions(-1).reducingFraction();

                System.out.printf("Solution of %sx + %s = 0 is x = %s. ", a, b, solution.mixedNumber());

            } else if (b.equals(ZERO)) {
                System.out.printf("Equation %sx + %s = 0 is identity. Its solution is the set of all real numbers.", a, b);
            } else {

                System.out.printf("Equation %sx + %s = 0 is a contradictory . Its solution is an empty set.", a, b);
            }


        }
    }
}

