package inputOutput.tasks.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*11.3
  Napisz program obliczający długość przeciwprostokątnej w trójkącie prostokątnym,
 mając dane:
 a) długości przyprostokątnych,
 b) długość przyprostokątnej i miarę kąta ostrego (podaną w stopniach) leżącego
 naprzeciw tej przyprostokątnej.*/
public class SecondTask {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        double a, b, c, α;

        // a) length of a and b.
        System.out.print("Please insert the length of the first leg in the rectangular triangle, a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Please insert the length of the second leg in the rectangular triangle, b = ");
        b = Double.parseDouble(br.readLine());
        c = Math.sqrt((a * a + b * b));
        System.out.printf("The length of the hypotenuse in the rectangular triangle with sides a = %.2f cm, b = %.2f cm equals c = %.2f cm %n ", a, b, c);

        // b) length of the leg and an acute angle measure (given in degrees) of lying opposite the side of the leg
        System.out.print("\nPlease insert the length of the leg in the rectangular triangle, a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Please insert an acute angle measure (given in degrees) of lying opposite the side of the leg, α =   ");
        α = Double.parseDouble(br.readLine());
        c = a / Math.sin(Math.toRadians(α));
        System.out.printf("The length of the hypotenuse in a triangle with side a = %.2f cm and an acute angle α = %.2f\u00B0 equals c = %.2f cm %n", a, α, c);
    }
}
