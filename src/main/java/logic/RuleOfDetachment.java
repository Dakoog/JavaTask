package logic;

//6.6 D
public class RuleOfDetachment {
    public static void main(String[] args) {
        Boolean[] bl = {true, false};
        System.out.println("The rule of detachment: \n[(p => q) ∧ q] => q");
        System.out.println("|\tp\t|\tq\t|\tp => q\t|\t(p => q) ∧ q\t|\t[(p => q) ∧ q] => q\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl) {
                boolean r = Implications.impl(p, q);
                boolean s = r && q;
                System.out.println("  " + p + "\t" + "  " + q + "\t\t" + r + "\t\t" + " " + s + "\t\t\t\t\t" + Implications.impl(s,q));
            }
        }
        System.err.println("\t\t\tConclusion: Rule of detachment is law. ");
    }
}
