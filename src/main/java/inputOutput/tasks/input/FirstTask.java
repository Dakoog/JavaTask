package inputOutput.tasks.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 10.1 Napisz program zamieniający temperaturę podaną w stopniach Celsjusza na temperaturę wyrażoną w stopniach Fahrenheita.
 Dane wejściowe wprowadzamy z klawiatury w postaci liczby dziesiętnej; wynik należy obliczyć i wyświetlić z dokładnością do
0,1 stopnia
   10.2 Napisz program zamieniający temperaturę podaną w stopniach Fahrenheita na temperaturę wyrażoną w stopniach Celsjusza.
 Dane wejściowe wprowadzamy z klawiatury w postaci liczby dziesiętnej; wynik należy obliczyć i wyświetlić z dokładnością do
0,1 stopnia*/
public class FirstTask {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        //10.1) Convert temperature Centigrade to temperature Fahrenheit.
        double temperatureCentigrade, temperatureFahrenheit;

        System.out.println("Convert Centigrade temperature to Fahrenheit.");
        System.out.print("Please insert temperature in \u00b0C, t = ");
        temperatureCentigrade = Double.parseDouble(br.readLine()); //throwing input output exception to code client -> psvm
        temperatureFahrenheit = 1.8 * temperatureCentigrade + 32;

        System.out.printf("%.1f\u00b0C = %.1f\u00b0F %n", temperatureCentigrade,temperatureFahrenheit);

       //10.2) Convert temperature Fahrenheit to temperature Centigrade .
        System.out.println("Convert Fahrenheit temperature to Centigrade.");
        System.out.print("Please insert temperature in \u00b0F, t = ");
        temperatureFahrenheit = Double.parseDouble(br.readLine());
        temperatureCentigrade = 5*(temperatureFahrenheit - 32)/9;

        System.out.printf("%.1f\u00b0F = %.1f\u00b0C %n",temperatureFahrenheit, temperatureCentigrade);
    }
}
