package character;

/*Utwórz tablicę zawierającą znaki sowa Informatyka. Napisz program wyświetlający
znaki zawarte w tablicy w następujący sposób:
a) pionowo — każdy znak w odrębnym wierszu,
b) poziomo — znaki rozdzielone dodatkowymi odstępami (tzw. spacjowanie
lub rozstrzelenie tekstu)
c) poziomo -> wszystkie znaki pisane dużą literą
d) poziomo -> wszystkie znaki pisane małą literą */
public class Informatics {
    public static void main(String[] args) {
        char[] informatics = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 's', '.'};

        System.out.println("\na)Vertically - each letter separately.\n");
        for (char sign : informatics) {
            System.out.println("\t\t" + sign);
        }

        System.out.println("\nb)Horizontally - exploded letter");
        for (char sign : informatics) {
            System.out.print(sign + " ");
        }
        //
        System.out.println("\nc)Each letter to upper case");
        for (char sign : informatics) {
            System.out.print(Character.toUpperCase(sign));
        }
        System.out.println("\nd)Each letter to lower case");
        for (char sign : informatics) {
            System.out.print(Character.toLowerCase(sign));
        }
    }
}

