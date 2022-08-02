package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Zadanie 14.5.
Napisz program obliczający pole powierzchni pierścienia kołowego o promieniu zewnętrznym R i wewnętrznym r. Dlugosci promieni uzytkownik wprowadza z klawiatury.
Program powinien zasygnalizować błędne dane i ponownie zapytac o potrzebne
wartosci.*/
public class CircularRingArea {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please insert radius of radius of the outer circle R, and radius of inner circle r.  ");
        double rOuter = 0, rInner;

        do {
            try {
                rOuter = Double.parseDouble(br.readLine());
                if(rOuter <= 0) {
                    System.out.println("Remember, that radius this is positive number. Repeat Insertion.");}
                rInner = Double.parseDouble(br.readLine());
                if ( rInner <= 0) {
                    System.out.println("Remember, that radius this is positive number. Repeat Insertion.");
                }
                if(rInner>=rOuter){
                    System.out.println("Remember, radius inner is smaller than radius outer. Repeat Insertion.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Remember, that radius this is positive number. Repeat Insertion.");
                rInner = -1;
            }

        } while (rInner >= rOuter || rInner <= 0);


        double ringCircularArea = Math.PI * (rOuter * rOuter - rInner * rInner);
        System.out.printf("Ring circular area for r = %.1f and R = %.1f is %.2f[j]^2.", rInner, rOuter, ringCircularArea);
        input.close();
    }
}
