package fractions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionsMain {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(input)) {
            System.out.println("""
                            LIST OF ACTION
                    ------------------------------
                    1 - reduce of fraction
                    2 - inverse of fraction
                    3 - multiply of fractions
                    4 - division of fractions
                    5 - adding of fractions
                    6 - subtraction of fractions
                    7 - change to improper fraction
                    0 - end.
                    """);
            int actionOfFractions;

            do {
                try {
                    System.err.println("Select which with given action of fraction you want perform");
                    actionOfFractions = Integer.parseInt(br.readLine());
                    System.out.println("Please, insert fraction or mixed number: a/b (n a/b)");

                    switch (actionOfFractions) {

                        case 0 -> System.err.println("\n\t \t \t \t \t The End. See you.");

                        case 1 -> {
                            System.out.println("\n*** REDUCE FRACTION ***");
                            Fraction x = Input.inputFraction(br);

                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.printf("%s = ", x);
                            Fraction result = x.reducingFraction();
                            System.out.print(result + " = ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 2 -> {
                            System.out.println("\n*** INVERSE FRACTION ***");
                            Fraction x = Input.inputFraction(br);
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.printf("%s -> ", x);
                            Fraction result = x.fractionInverse().reducingFraction();
                            System.out.print(result + " -> ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 3 -> {
                            System.out.println("\n*** MULTIPLY FRACTIONS ***");
                            Fraction x = Input.inputFraction(br);
                            System.err.println("\nNext insert");
                            Fraction y = Input.inputFraction(br);
                            Fraction result = x.multiplyFractions(y).reducingFraction();
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.print(x.mixedNumber());
                            System.out.print(" x ");
                            System.out.print(y.mixedNumber());
                            System.out.print(" = ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 4 -> {
                            System.out.println("\n*** DIVISION FRACTIONS ***");
                            Fraction x = Input.inputFraction(br);
                            System.err.println("\nNext insert");
                            Fraction y = Input.inputFraction(br);
                            Fraction result = x.divisionFractions(y).reducingFraction();
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.print(x.mixedNumber());
                            System.out.print(" : ");
                            System.out.print(y.mixedNumber());
                            System.out.print(" = ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 5 -> {
                            System.out.println("\n*** ADDING FRACTIONS ***");
                            Fraction x = Input.inputFraction(br);
                            System.err.println("\nNext insert");
                            Fraction y = Input.inputFraction(br);
                            Fraction result = x.addingFractions(y).reducingFraction();
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.print(x.mixedNumber());
                            System.out.print(" + ");
                            System.out.print(y.mixedNumber());
                            System.out.print(" = ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 6 -> {
                            System.out.println("\n*** SUBTRACTION FRACTIONS ***");
                            Fraction x = Input.inputFraction(br);
                            System.err.println("\nNext insert");
                            Fraction y = Input.inputFraction(br);
                            Fraction result = x.subtractionFractions(y).reducingFraction();
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            System.out.print(x.mixedNumber());
                            System.out.print(" - ");
                            System.out.print(y.mixedNumber());
                            System.out.print(" = ");
                            System.out.print(result.mixedNumber());
                            System.out.println("\n---------------------------------------------------");
                        }
                        case 7 -> {
                            System.out.println("\n*** CHANGE TO IMPROPER FRACTION ***");
                            Fraction x = Input.inputFraction(br);
                            System.out.println("next insert whole");
                            int n = Integer.parseInt(br.readLine());
                            System.out.print("""
                                    ---------------------------------------------------
                                    Calculating:\s""");
                            Fraction result = x.changeToImproperFraction(n, x);
                            System.out.print(result.mixedNumber());
                            System.out.print(" = " + result);
                            System.out.println("\n---------------------------------------------------");
                        }
                        default -> System.out.println("Type wrong number of action. Try again");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("This number is invalid.");
                    actionOfFractions = -1;
                } catch (IllegalArgumentException iae) {
                    System.out.println("Don't division by zero!");
                    actionOfFractions = -1;
                }
            } while (actionOfFractions != 0);
        }
    }
}

