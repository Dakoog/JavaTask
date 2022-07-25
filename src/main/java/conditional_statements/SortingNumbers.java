package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Użytkownik wprowadza z klawiatury trzy liczby a, b i c. Napisz program, który wyświetli te liczby w sposób uporządkowany, w kolejności od najmniejszej do największej
(lub od największej do najmniejszej). Nie wprowadzaj dodatkowych zmiennych.*/
public class SortingNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert three real numbers,\n" +
                "a = ");
        Double a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        Double b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        Double c = Double.parseDouble(br.readLine());
        System.out.print("Sorting number : ");
        if (a <= b) {
            if (a <= c) {
                if (b <= c) {
                    System.out.printf("%.2f, %.2f, %.2f", a, b, c);
                } else {
                    System.out.printf("%.2f, %.2f, %.2f", a, c, b);
                }
            } else {
                System.out.printf("%.2f, %.2f, %.2f", c, a, b);
            }

        } else {
            if (b <= c) {
                if (a <= c) {
                    System.out.printf("%.2f, %.2f, %.2f", b, a, c);
                } else {
                    System.out.printf("%.2f, %.2f, %.2f", b, c, a);
                }
            } else {
                System.out.printf("%.2f, %.2f, %.2f", c, b, a);
            }
        }
    }
}
