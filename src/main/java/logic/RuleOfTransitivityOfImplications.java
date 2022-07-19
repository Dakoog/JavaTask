package logic;

// 6.6 Napisz program, który przedstawi w tabelę dowód, że reguła przechodniości implikacji jest prawem.
public class RuleOfTransitivityOfImplications {
    public static void main(String[] args) {
        Boolean[] bl = {true, false};
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\tRule of transitivity of implications.");
        System.out.println("|\tp\t|\tq\t|\tr\t|\t(p => q)\t|\t(q => r)\t|\t(p => q) ∧ (q => r)\t|\t(p => r)\t|\t[(p => q) ∧ (q =>r)] => (p => r)\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl) {
                for (Boolean r : bl) {
                    boolean v = (impl(p, q) && impl(q, r));
                    boolean s = impl(p, r);

                    boolean u = Boolean.compare(p, r) < 1;
                    boolean x = Boolean.compare(v, u) < 1;

                    System.out.println(" " + p + "\t" + " " + q + "\t" + " " + r + "\t\t  " + impl(p, q) + "\t\t\t "
                            + impl(q, r) + "\t\t\t\t"  + v + "\t\t\t\t" + " " + s + " \t\t\t\t\t  " + impl(v, s));
                }
            }
        }
        System.err.println("Conclusion: Rule of transitivity of implications is a law. ");
    }

    public static Boolean impl(Boolean p, Boolean q) {
        return (Boolean.compare(p, q) < 1);
    }
}
