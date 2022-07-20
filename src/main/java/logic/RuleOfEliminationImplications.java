package logic;

public class RuleOfEliminationImplications {
    public static void main(String[] args) {
        Boolean[] bl = {true, false};
        System.out.println("\nRule of elimination implications: (p => q) <=> (~p ∧ q)");
        System.out.println("|\tp\t|\tq\t|\t~p\t|\tp => q\t|\t(p => q) <=> (~p ∧ q)\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl) {
                boolean r = Implications.impl(p, q);

                System.out.println("  " + p + "\t" + "  " + q + "\t  " + !p + "\t\t" + (!p && q) + "\t\t\t\t" + (r==(!p && q)));
            }
        }
        System.err.println("\t\t\tConclusion: Rule of detachment is law. ");
    }
}


