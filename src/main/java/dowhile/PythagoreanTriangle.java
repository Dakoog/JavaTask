package dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*14.9
Napisz program umożliwiający wielokrotne wygenerowanie długości boków trójkąta prostokątnego.
Po wykonaniu obliczeń program powinien wyświetlić pytanie, Czy obliczamy dalej (yes/no)?.
W pytaniu zawarta jest sugestia sposobu udzielenia odpowiedzi: yes —> kontynuacja działania programu,
no -> zakończenie działania (inne odpowiedzi powinny być ignorowane).
*/
public class PythagoreanTriangle {


    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String answer;
        int counter = 0;
        do {
            System.out.println("Determination of the length of the three sides of a right triangle.");
            int n;
            do {
                try {
                    System.out.print("Please, insert natural positive number n = ");
                    n = Integer.parseInt(br.readLine());
                } catch (NumberFormatException nfe) {
                    n = -1;
                }
            } while (n <= 0);
            counter++;
            System.out.printf("%d. Sides of a right triangle a = %d, b = %d and c = %d. %n", counter, (2 * n + 1),
                    (2 * n * n + 2 * n), (2 * n * n + 2 * n + 1));

            do {
                System.out.println("Do you continue calculate? (yes/no)");
                answer = br.readLine();

            } while (answer == null || !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));
        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("The end. See you.");
        input.close();
    }
}
