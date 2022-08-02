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
        System.out.print("Please, insert natural number which difines upper limit of the Fibonacci sequence, n = ");
        int n = Integer.parseInt(br.readLine());
        input.close();

        int a, b, c;
        int count = 2;
        a = 1;
        b = 1;
        c = a + b;

        do {
            a = b;
            b = c;
            c = a + b;
            count++;

        } while (c < n);
        System.out.println("The abundance of Fibonacci sequence for upper limit n = " + n + ", is " + count + ".");
    }

}
