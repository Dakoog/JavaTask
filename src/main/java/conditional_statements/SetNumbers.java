package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Użytkownik wprowadza z klawiatury dwie liczby rzeczywiste: a i b. Napisz program,
który wyświetli (zapisany w sposób symboliczny) zbiór złożony z tych liczb oraz
wszystkich liczb zawartych między nimi*/
public class SetNumbers {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert two real numbers.\n" +
                "First number a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Second number b = ");
        double b = Double.parseDouble(br.readLine());
        input.close();

        if(a == b ){
            System.out.printf("Result it is set {%.2f}. %n",a);
        } else if (a>b) {
            System.out.printf("Result it is interval <%.2f ; %.2f>. %n",b,a);
        }else {
            System.out.printf("Result it is interval <%.2f ; %.2f>. %n",a,b);
        }
    }
}
