package args;
/*5.2
Napisz program, który uruchamiany z dwoma parametrami, imię i nazwisko,
 oraz wyświetli na ekranie w kolejnych wierszach te dane według schematu:

Nazwisko: Kowalska
Imię: Maria
Nazwisko i imię: KOWALSKA Maria
Inicjały: MK
Login: KOmar
*/

public class Person {
    public static void main(String[] args){

        System.out.println("\t\t*** PERSONAL DATA ***");
        System.out.println("----------------------------------");
        System.out.println("Surname: " + args[1].substring(0, 1).toUpperCase().concat(args[1].substring(1).toLowerCase()));
        System.out.println("Name: " + args[0].substring(0, 1).toUpperCase().concat(args[0].substring(1).toLowerCase()));
        System.out.println("Personal data: " + args[1].toUpperCase().concat(" ").concat( args[0].substring(0, 1).toUpperCase()
                                              .concat(args[0].substring(1).toLowerCase())));
        System.out.println("Initials: " + args[0].toUpperCase().charAt(0)+args[1].toUpperCase().charAt(0));
        System.out.println("Login: " + args[0].substring(0,3).toUpperCase()+args[1].substring(0,4).toLowerCase());

    }

}
