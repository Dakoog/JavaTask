package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Stosując instrukcję selekcji, napisz program, który podaną przez użytkownika cyfrę zapisze słownie.
 */
public class VerbalNotationOfNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please insert digit (number 0 - 9)");

        try {
            int digit = Integer.parseInt(br.readLine());
            if (digit > 9 || digit < 0) {
                System.out.println("Error! It isn't digit.");
                System.exit(0);
            }
            switch (digit) {
                case 1 -> System.out.println("1 - one");
                case 2 -> System.out.println("2 - two");
                case 3 -> System.out.println("3 - three");
                case 4 -> System.out.println("4 - four");
                case 5 -> System.out.println("5 - five");
                case 6 -> System.out.println("6 - six");
                case 7 -> System.out.println("7 - seven");
                case 8 -> System.out.println("8 - eight");
                case 9 -> System.out.println("9 - nine");
                case 0 -> System.out.println("0 - zero");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("This isn't digit.");

        }

    }


}

