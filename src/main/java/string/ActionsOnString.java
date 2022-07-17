package string;
/* 4.4 Utwórz łańcuch znaków "java programming curse.", a następnie: 	r
    a) zamień pierwszą literę na dużą
    b) zamień wszystkie litery na duże
4.5 c) napisz ten łańcuch wspak
4.5  */
public class ActionsOnString {
    public static void main(String[] args) {
        String javaProgramming = "java programming course.";

        //a) first letter to uppercase
        javaProgramming = javaProgramming.toUpperCase().charAt(0) + javaProgramming.substring(1);
        System.out.println("First letter to uppercase: " + javaProgramming);

         //b) all to uppercase
        System.out.println("All letters to uppercase: " + javaProgramming.toUpperCase());

        // c) reverse
        System.out.print("Reverse: ");
        for (int i = javaProgramming.length() - 1; i >= 0; --i) {
            System.out.print(javaProgramming.charAt(i));
        }

    }
}
