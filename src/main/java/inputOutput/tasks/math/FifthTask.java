package inputOutput.tasks.math;
/*
Wyświetl w konsoli kody ósemkowe, dziesiątkowe i szesnastkowe wielkich liter alfabetu łacińskiego. W pierwszym wierszu umieść opisy poszczególnych kolumn:
Znak,OCT, DEC i HEX.*/
public class FifthTask {
    public static void main(String[] args) {
        System.out.printf("Znak|%11s|%11s|%11s|%n","OCT","DEC","HEX");
        System.out.println("----|-----------|-----------|-----------|");
        char[] characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (char c : characters) {
            System.out.printf("%1$3c |%2$10o |%2$10d |%2$10X |%n",c,(int)c);
        }
    }
}
