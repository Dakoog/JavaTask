package inputOutput.tasks.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*11.5. Napisz program, który zamieni ułamek zwykły na procent. Ułamek zwykły wprowadzamy z klawiatury w postaci
łańcucha znaków złożonego z dwóch liczb całkowitych (licznika i mianownika) oddzielonych znakiem / (bez odstępów). Wynik należy
wyświetlić z dokładnością do 0,1%*/
public class Fraction {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String fraction;
        System.out.println("Please insert fraction a/b = ");
        fraction = br.readLine();
        int a = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
        int b = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
        double procent = (100.0 * a) / b;
        System.out.printf("%d/%d = %.1f%% %n", a, b, procent);


    }
}
