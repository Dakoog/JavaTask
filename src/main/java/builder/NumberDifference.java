package builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Napisz program, który obliczy różnicę liczby całkowitej dodatniej wprowadzonej
z konsoli i liczby zapisanej tymi samymi cyframi w odwrotnej kolejności. Wynik wy-
świetl w postaci całego wyrażenia, np.: 452-254 = 198*/
public class NumberDifference {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\tCALCULATE DIFFERENCE OF TWO NUMBERS");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("\tPlease, insert any integer number, x = ");
        int number = Integer.parseInt(br.readLine());
        StringBuilder numberB = new StringBuilder();
        numberB.append(number).reverse();
        int reverseNumber = Integer.parseInt(String.valueOf(numberB));
        int difference = number - reverseNumber;
        System.out.printf("\t\t\t%d - %d = %d %n", number, reverseNumber, difference);
    }
}