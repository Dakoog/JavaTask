package logic;

//Napisz program, który przedstawi tabelę wartości logicznych implikacji
public class Implication {
    public static void main(String[] args) {
        boolean[] bl = {true, false};
        System.out.println("\t Implication (p => q): ");
        System.out.println("|\tp\t| \tq\t |\tp => q\t|");
        for (boolean p : bl) {
            for (boolean q : bl) {
                System.out.println(" " + p + " \t " + q + "\t\t " + (Boolean.compare(p, q) < 1));
            }
        }
        System.err.println(" Conclusion: The implication is only false when preceding sentence is true and sentence follow is false.");
    }
}
