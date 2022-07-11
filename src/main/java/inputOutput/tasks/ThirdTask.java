package inputOutput.tasks;

/*
Napisz aplikację, która wyświetli w konsoli w trzech kolumnach liczby naturalne 2, 3,
5, 7, 11, 13 i 17, pierwiastki kwadratowe i pierwiastki sześcienne z tych liczb. Warto-
ści pierwiastków wyświetlaj z dokładnością do 8 miejsc po przecinku, w kolumnach
o szerokości 15 znaków System.out.printf("Number: %3d|%15.8f|%15.8f|%n", i, Math.sqrt(i), Math.cbrt(i));
*/
public class ThirdTask {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 17;
        for (int i = rangeFrom; i < rangeTo; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("Number: %3d|%15.8f|%15.8f|%n", i, Math.sqrt(i), Math.cbrt(i));
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}


