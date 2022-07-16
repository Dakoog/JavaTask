package character;

import static java.lang.System.*;

public class DemoCharacter {
    public static void main(String[] args) {
        /* Informacje o metodzie */
        out.println("Class: java.lang.Character");
        out.println("Static method: digit");
        out.println("static int digit(int ch, int radix)");
        out.println("Returns the numeric value of the character ch in the specified radix.");
        out.println();

        /* Sample character array */
        char[] sign = {'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2'};

        /* Demonstration of the method in operation */
        out.println("Character value as digits in decimal (radix = 10)");
        for (char element : sign) {
            out.println("\tChar: " + element + " Digit: " + Character.digit(element, 10));
        }


        out.println("\nCharacter value as digits in hexadecimal layout (radix = 16)");
        for (char element : sign) {
            out.println("\tChar: " + element + " Digit: " + Character.digit(element, 16));
        }
        err.println("Warring: -1 -> it isn't digit");
    }
}
