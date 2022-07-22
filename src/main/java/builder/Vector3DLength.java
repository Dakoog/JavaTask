package builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Symbol [a, b, c] w geometrii analitycznej oznacza wektor o współrzędnych, a i b (w przestrzeni trójwymiarowej, czyli w przestrzeni).
Napisz program obliczający długość wektora [a, b, c] wprowadzonego przez użytkownika z klawiatury w postaci łańcucha znaków, np. [2.5, -4, -0.7]*/
public class Vector3DLength {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\t CALCULATE VECTOR 3D LENGTH");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert vector 3D in notation [a, b, c]. V = ");
        String vector3D = br.readLine().trim();
        input.close();

        StringBuilder coordinates = new StringBuilder(vector3D);
        coordinates.deleteCharAt(0).deleteCharAt(coordinates.length() - 1);
        int firstPlace = (coordinates.indexOf(","));
        int secondPlace = (coordinates.lastIndexOf(","));

        double a = Double.parseDouble(coordinates.substring(0, firstPlace));
        double b = Double.parseDouble(coordinates.substring(firstPlace + 1, secondPlace));
        double c = Double.parseDouble(coordinates.substring(secondPlace + 1));
        double vectorLength3D = Math.sqrt(a * a + b * b + c * c);
        System.out.printf("%nVector 3D length V = %s is %.2f.%n", vector3D, vectorLength3D);
    }
}
