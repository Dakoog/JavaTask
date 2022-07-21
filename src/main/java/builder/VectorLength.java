package builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Symbol [a, b] w geometrii analitycznej oznacza wektor o współrzędnych, a i b (w przestrzeni dwuwymiarowej, czyli na płaszczyźnie).
Napisz program obliczający długość wektora [a, b] wprowadzonego przez użytkownika z klawiatury w postaci łańcucha znaków, np. [2.5, -4].
*/
public class VectorLength {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\t\t\tCALCULATE VECTOR LENGTH ");
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please, insert vector coordinates in the notation [a, b]");
        String vector = br.readLine().trim();
        input.close();
        StringBuilder coordinates = new StringBuilder(vector);
        coordinates.deleteCharAt(0).deleteCharAt(coordinates.length()-1);
        int place = coordinates.indexOf(",");

        double a = Double.parseDouble(coordinates.substring(0, place));
        double b = Double.parseDouble(coordinates.substring(place+1));
        double vectorLength = Math.sqrt((a*a + b*b));
        System.out.printf("Vector length %s is %.2f%n", vector, vectorLength);

    }
}
