package character;

public class DigitsOfHexadecimal {
    public static void main(String[] args) {
        char[] digits = new char[16];
        for (int i = 0; i < 16; ++i) {
            digits[i] = Character.toUpperCase(Character.forDigit(i, 16));
        }

        System.out.print("Digit of hexadecimal layout : ");
        System.out.println(digits);
    }
}

