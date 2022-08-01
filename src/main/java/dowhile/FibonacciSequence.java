package dowhile;

/*14.6
Napisz program wyświetlający w konsoli ciąg liczb Fibonacciego mniejszych od 1000.*/
public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print("Fibonacci sequence " + a + ", " + b);
        int c = b + a;
        do {
            System.out.print(", " + c);
            a = b;
            b = c;
            c = a + b;
        } while (c < 1000);
        System.out.println(".");
    }
}
