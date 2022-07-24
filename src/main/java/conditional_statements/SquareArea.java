package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*13.2.
Napisz program obliczający pole powierzchni i obwód kwadratu.
Długość boku kwadratu użytkownik wprowadzi z klawiatury.
Program powinien sprawdzić, czy wprowadzona długość boku jest poprawna (dodatnia).

*/
public class SquareArea {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\tCALCULATE AREA AND PERIMETER OF SQUARE.");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert length of the side of the square. Remember, it is positive number! a = ");
        Double a = Double.parseDouble(br.readLine());
        input.close();

        double squareArea = a * a;
        double perimeterOfSquare = 4 * a;

        if (a <= 0) {
            System.err.println("Remember, length of the side of the square it is positive number!");
            System.exit(0);
        } else {
            System.out.printf("The area of a square with a side a = %.1f is %.2f. %nHis perimeter is %.2f ", a, squareArea, perimeterOfSquare);
        }
    }


}
