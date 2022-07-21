package builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Wykresem funkcji kwadratowej f(x) = ax^2 + bx +c,jest parabola o wierzchołku w punkcie W = (p, q)
Napisz program, który obliczy i wyświetli w konsoli współrzędne wierzchołka paraboli. Zakładamy, że użytkownik będzie podawał poprawne współczynniki
trójmianu.*/
public class VertexOfParabola {
    public static void main(String[] args) throws IOException {

        System.out.println("\n\t\t\t CALCULATE THE VERTEX COORDINATES OF PARABOLA  ");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert quadratic function coefficients: f(x) = ax^2 + bx + c:\n" +
                "a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("\nb = ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("\nc = ");
        double c = Double.parseDouble(br.readLine());
        double p = -1 * b / (2 * a);
        double q = -1 * (b*b - 4 * a * c) / (4 * a);
        input.close();

        // first version - append
        System.out.printf("Function f(x) = %.1fx^2 + %.1fx + %.1f has got vertex in point ", a, b, c);
        StringBuilder vertex =new StringBuilder("V = (");
        vertex.append(p).append(" ; ").append(q).append(")");
        System.out.println(vertex);

        //second version - insert
        System.out.printf("Function f(x) = %.1fx^2 + %.1fx + %.1f has got vertex in point V = ", a, b, c);
        StringBuilder vertex2 = new StringBuilder("( ; )");
        vertex2.insert(3,q).insert(1, p);// Warning! Insert from the end!
        System.out.println(vertex2);

        // third version - replace
        System.out.printf("Function f(x) = %.1fx^2 + %.1fx + %.1f has got vertex in point V = ", a, b, c);
        StringBuilder vertex3 = new StringBuilder("(#1 ; #2 )");
        int x = vertex3.indexOf("#1");
        vertex3.replace(x,x+1, Double.toString(p));
        x = vertex3.indexOf("#2");
        vertex3.replace(x,x+1, Double.toString(q));
        System.out.print(vertex3);
    }

}

