package string;

/*4.3.
Utwórz łańcuch zawierający napis Dzień dobry. Napisz aplikację, która wywietli napis w konsoli:
a) pionowo — każdy znak w odrębnym wierszu,
b) poziomo — znaki rozdzielone dodatkowymi odstępami (tzw. spacjowanie
lub rozstrzelenie tekstu),
c) poziomo — wielkimi literami,
d) poziomo — maymi literami.
*/
public class GoodMorning {
    public static void main(String[] args) {

        String welcome = "Good Morning.";
        System.out.println("\na)Vertically - each letter separately.\n");
        for (int i = 0; i < welcome.length(); i++) {
            System.out.println("\t\t"+welcome.charAt(i));
        }

        System.out.println("\nb)Horizontally - exploded letter");
        for (int i = 0; i < welcome.length(); i++) {

            System.out.print(welcome.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("\nc)Each letter to upper case");
        String upperCase = welcome.toUpperCase();
        System.out.println(upperCase);

        System.out.println("\nd)Each letter to lower case");
        String lowerCase = welcome.toLowerCase();
        System.out.println(lowerCase);
    }
}
