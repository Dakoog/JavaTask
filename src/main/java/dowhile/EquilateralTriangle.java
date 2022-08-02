package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*14.8
Napisz program obliczający pole powierzchni trójkąta równobocznego i umożliwiający wielokrotne powtarzanie obliczeń.
Jako znak zakończenia obliczeń przyjmij podanie długoci boku równej 0. Dla wartości ujemnych wyświetl stosowny komunikat
i ponów pytanie o długość boku.
*/
public class EquilateralTriangle {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please, insert length of  equilateral triangle side.");
        double a;
        do {
            System.out.print("a = ");

            try{
                a = Double.parseDouble(br.readLine());
                if (a < 0) {
                    System.out.println("Remember, length of triangle side is positive number. ");
                }
                else if (a > 0) {
                    System.out.printf("Area of equilateral triangle for a =  %.1f is %.2f%n ", a, a * a * Math.sqrt(3) / 4);
                    System.out.print("\nNew calculate for ");
                } else {
                    System.out.println("The end. See you.");
                }
            }catch (NumberFormatException nfe){
                System.out.println("Remember, length of triangle side is positive number. ");
                a = -1;
            }


        } while (a != 0);

        input.close();
    }
}
