package character;

/*Utwórz tablicę zawierającą znaki słowa programming.
Napisz program wyświetlający znaki zawarte w tablicy w kolejnoci odwrotnej — od końca do początku*/
public class ReverseWord {
    public static void main(String[] args) {
        char[] programming = "programming.".toCharArray();
        System.out.println("I. Reverse fori");
        for (int i = programming.length - 1; i >= 0; --i) {
            System.out.print(programming[i]);
        }
        System.out.println("\n\nII. Replace the ending letters with the beginning ones");
        for (int i = 0, j = programming.length - 1; i < j; i++, --j) {
            char reverse = programming[i];
            programming[i] = programming[j];
            programming[j] = reverse;
        }
        System.out.println(programming);
    }
}
