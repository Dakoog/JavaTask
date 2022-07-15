package character;

/*Utwórz tablicę zawierającą znaki sowa Informatyka. Napisz program wyświetlający
znaki zawarte w tablicy w następujący sposób:
a) pionowo — każdy znak w odrębnym wierszu,
b) poziomo — znaki rozdzielone dodatkowymi odstępami (tzw. spacjowanie
lub rozstrzelenie tekstu).*/
public class Informatics {
    public static void main(String[] args) {
        char[] informatics = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 's', '.'};
        // a) pionowo -> każdy znak w odrębnym wierszu
        for (char e : informatics) {
            System.out.println("\t\t" + e);
        }
        //b) poziomo -> znaki rozdzielone dodatkowymi odstępami (tzw.spacjami, czyli tekst rozstrzelony)
        System.out.println();
        for (char e : informatics) {
            System.out.print(e + " ");
        }
    }
}

