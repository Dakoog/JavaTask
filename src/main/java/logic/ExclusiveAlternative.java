package logic;
// 6.5.
//Napisz program, który przedstawi tabelę wartości logicznych alternatywy wykluczającej
public class ExclusiveAlternative {

    public static void main(String[] args) {

        Boolean[] bl = {true, false};

        System.out.println();
        System.out.println("\t\t\t\t\tExclusive Alternative (p ⊕ q).");
        System.out.println("|\tp \t|\tq \t|\tp ∨ q \t|\t p ∧ q\t|\t∼( p ∧ q)\t|\t(p ∧ q) ∧ ∼( p ∧ q)\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl)
                System.out.println(" " + p + "\t" + " " + q + "\t" + "\t" + (p || q) + "\t" + "\t" + (p && q) + "\t" + "\t" + !(p && q) + " \t\t\t\t" + " " + ((p || q) && !(p && q)));
        }
        System.err.println(" Conclusion: The exclusive alternative is only true when only one sentence is true");
    }
}
