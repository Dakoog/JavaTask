package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

/*13.7.
Użytkownik wprowadza z klawiatury trzy liczby a, b i c.
Napisz program, który wyświetli najmniejszą (lub największą) z tych liczb.
Nie wprowadzaj dodatkowych zmiennych.*/
public class ExtremalValues {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\t MAX AND MIN VALUE ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert three numbers.\n" +
                "a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        double c = Double.parseDouble(br.readLine());
        input.close();
        StringBuilder result = new StringBuilder();

        System.out.printf("There are three numbers a = %.2f, b = %.2f, c = %.2f.%n", a, b, c);
        if (a > b && b > c) {
            result.append("Max value it is ").append(a).append(", and min value it's ").append(c);
        } else if (a > c && c > b) {
            result.append("Max value it is ").append(a).append(", and min value it's ").append(b);
        } else if (b > a && a > c) {
            result.append("Max value it is ").append(b).append(", and min value it's ").append(c);
        } else if (b > c && a < c) {
            result.append("Max value it is ").append(b).append(", and min value it's ").append(a);
        } else if (c > b && a < b) {
            result.append("Max value it is ").append(c).append(", and min value it's ").append(a);
        } else {
            result.append("Max value it is ").append(c).append(", and min value it's ").append(b);
        }
        System.out.println(result);
        // Alternative -> three-field expression
        double max = (max((max(a, b)), c));//((((a>b)? a:b)>c)?((a>b)?a:b):c);
        double min = (min((min(a, b)), c));//((((a<b)? a:b)<c)?((a<b)?a:b):c);
        System.out.println("Max value it is " + max + ", min value it is " + min);
    }
}
