package string;

/*Napisz program, który utworzy łańcuch znaków wypełniony:
4.7 a) cyframi od 0 do 9
4.8 b) cyframi układu szesnastkowego
* */
public class DigitalString {
    public static void main(String[] args) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            digits.append((char) (i + 48));
        }
        System.out.print("\na) Digits:  ");
        System.out.println(digits);
        StringBuilder digit = new StringBuilder();
        for (int i = 0; i < 16; ++i)
            digit.append(Character.forDigit(i, 16));
        System.out.print("b) Digits of hexadecimal layout : ");
        digit = new StringBuilder(digit.toString().toUpperCase());
        System.out.println(digit);
    }
}

