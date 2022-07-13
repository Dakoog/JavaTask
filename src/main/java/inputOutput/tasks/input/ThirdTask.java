package inputOutput.tasks.input;
/*11.4 Napisz program, który odczyta z konsoli dwie liczby zapisane w naturalnym kodzie binarnym,
       obliczy ich sumę i wyświetli wynik w postaci binarnej.
       Zaproponuj ograniczenie liczby cyfr binarnych stosownie do przyjętej metody obliczeń i użytych zmiennych.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThirdTask {


    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String aBinary, bBinary, sumBinary;
        System.out.println("Podaj dwie liczby w systemie binarnym");// system binarny, czyli zero-jedynkowy
        System.out.print("a = ");
        aBinary = br.readLine();
        int a = Integer.parseInt(aBinary, 2);
        System.out.print("b = ");
        bBinary = br.readLine();
        int b = Integer.parseInt(bBinary, 2);
        int sum = a + b;
        sumBinary = Integer.toBinaryString(a + b);
        System.out.printf("For a = %s(%d) and b = %s(%d), a + b = %s(%d) %n ", aBinary, a, bBinary, b, sumBinary, sum);
        // alternative
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        scanner.useRadix(2);// zmiana podstawy systemu liczbowego
        System.out.println("Podaj dwie liczby w systemie binarnym");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Sum a + b = " + (a + b));

        input.close();
    }
}
