package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*14.7.
Napisz program obliczający, ile jest liczb w ciągu Fibonacciego, mniejszych od podanej przez użytkownika liczby całkowitej n*/
public class AbundanceOfFibonacciSequence {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert nautral number which difines upper limit of the Fibonacci sequence, n = ");
        int n = Integer.parseInt(br.readLine());
        int count = 2;
        int a, b, c;
        a = 1;
        b = 1;
        c = a + b;
        do {
            a = b;
            b = c;
            c = a + b;
            count++;

        } while (c < n);
        System.out.println(count);
    }

}
