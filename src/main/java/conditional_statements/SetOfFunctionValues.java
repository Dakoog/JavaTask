package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Użytkownik wprowadza z klawiatury współczynniki funkcji kwadratowej f(x) = ax^2 + bx +c
Napisz program, który wyznaczy zbiór wartości tej funkcji lub wyświetli komunikat,
że podane współczynniki nie są poprawne (przypadek a = 0 ).*/
public class SetOfFunctionValues {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, give quadratic function coefficients f (x) = ax ^ 2 + bx + c\n" +
                "a = ");
        double a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.err.println("Warning! If a = 0 it isn't quadratic function.");
            System.exit(0);// immediately exits the code
        }
        System.out.print("b = ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        double c = Double.parseDouble(br.readLine());
        double Δ = b * b - 4 * a * c;
        double q = -1 * Δ / (4 * a);
        StringBuilder result = new StringBuilder();
        if (a > 0) {
            result.append("Set of quadratic function it is <").append(q).append(" ; +∞>");
        } else {
            result.append("Set of quadratic function it is <-∞ ; ").append(q).append(">");
        }
        System.out.println(result);
    }
}
