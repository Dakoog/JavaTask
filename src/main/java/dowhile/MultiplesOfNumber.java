package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplesOfNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.print("Please, insert natural number , b = ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("\nMultiples of " + b + " less than 100 it: ");
        int a =0;
        do {
            System.out.print(a + ", ");
            a += b;

        } while (a < 100);
        System.out.println("\b\b");
    }

}

