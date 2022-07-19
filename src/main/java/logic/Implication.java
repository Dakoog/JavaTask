package logic;
//∧,∨,∼,⇒,⇔ ⊕
public class Implication {
    public static void main(String[] args) {
        boolean[] bl = {true, false};
        System.out.println("\t\t Implication: ");
        System.out.println("|\tp\t| \tq\t |\tp => q\t|");
        for (boolean p : bl) {

            for (boolean q : bl) {

                System.out.println(" "+p + " \t "+q +"\t\t " + (Boolean.compare(p, q) <1));
            }
        }
    }
}
