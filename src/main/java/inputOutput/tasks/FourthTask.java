package inputOutput.tasks;
/*10.4 Napisz aplikację, która wyświetli w konsoli pierwiastki arytmetyczne od stopnia 2. do
        10. z liczby 5 z dokładnością do 6 miejsc po przecinku*/

import static java.lang.Math.*;

public class FourthTask {
    public static void main(String[] args) {
        int rangeFrom = 2;
        int rangeTo = 9;
        int x = 5;
        System.out.println("    Root of 5 for:   ");
        for (int i = rangeFrom; i <= rangeTo; i++) {
            System.out.printf(" degree %2d |%10.6f|%n", i, rootOfDegreeN(x,i));
        }
        System.out.printf(" degree 10 |%10.6f|%n",rootOfDegreeN(x,10));

    }

    public static double rootOfDegreeN(int number, int degree) {
        return pow(number, (1.0/degree));
    }
}
