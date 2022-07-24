package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3.6
Napisz program rozwiązujący równianie liniowe ax + b = 0 . Współczynniki równania
użytkownik wprowadzi z klawiatury. Rozważ wszystkie możliwe przypadki dla współczynników równania.
*/
public class LinearEquation {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\t SOLUTIONS OF A LINEAR EQUATION ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please insert numbers a and b for equation ax + b = 0\na = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        double b = Double.parseDouble(br.readLine());
        input.close();

        StringBuilder result = new StringBuilder();
        if (a == 0 && b == 0) {
            result.append("Identity equality. Infinitely many solutions: x є R ");
        } else if (a == 0) {
            result.append("Equally contradictory. No solution x є {∅}");
        } else {
            result.append("Equally ").append(a).append("x + ").append(b).append(" = 0 has exactly one solution x = ").append(-1 * b / a);
        }
        System.out.println(result);

    }
}
