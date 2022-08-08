package for_loop;

/*adding Palindrome code, which checks that given word or sentence is palindrome.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t M U L T I P L I C A T I O N   T A B L E");
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if (i * j < 10) {
                    System.out.print("| " + i + " x " + j + " =  " + i * j + " | ");
                }
                else if (i * j == 100) {
                    System.out.print("|" + i + " x " + j + " = " + i * j + "|\n ");
                }
                else {
                    if (i < 10) {
                        System.out.print("| " + i + " x " + j + " = " + i * j + " | ");
                    } else {
                        System.out.print("|" + i + " x " + j + " = " + i * j + " | ");
                    }
                }
            }
        }
    }
}
