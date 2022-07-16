package character;

/*3.3 Utwórz tablicĘ zawierającą znaki słowa programowanie. Napisz program zmieniający
 zawartość tablicy i wywietlający efekty tych zmian
a) zamień pierwszą literę na wielką,
b) zamień wszystkie litery na wielkie.*/
public class Programming {
    public static void main(String[] args) {
        char[] programming ="programming".toCharArray();
        System.out.println("\na)Change of the first letter to capital.");
        programming[0] = Character.toUpperCase(programming[0]);
        System.out.println(programming);

        System.out.println("\nb)Change all letters to capital to uppercase,");
        for (int i = 0; i < programming.length; i++) {
            programming[i] = Character.toUpperCase(programming[i]);
        }
        System.out.println(programming);
        System.out.println("\nc)Alternate -> once with uppercase and once with lowercase.");
        for (int i = 0; i < programming.length; i++) {
            if (i % 2 == 0) {
                programming[i] = Character.toUpperCase(programming[i]);
            } else {
                programming[i] = Character.toLowerCase(programming[i]);
            }
        }
        System.out.println(programming);
        System.out.println("\nd)Alternate -> once with lowercase and once with uppercase.");
        for (int i = 0; i < programming.length; i++) {
            if (i % 2 == 0) {
                programming[i] = Character.toLowerCase(programming[i]);
            } else {
                programming[i] = Character.toUpperCase(programming[i]);
            }
        }
        System.out.println(programming);

    }
}


