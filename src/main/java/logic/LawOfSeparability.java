package logic;
// 6.6 Napisz program, który przedstawi w tabeli dowód, że:
// a) reguła rozdzielności alternatywy względem koniunkcji jest prawem.
// b) reguła rozdzielności koniunkcji względem  alternatywy jest prawem.
public class LawOfSeparability {

    public static void main(String[] args) {
        Boolean[] bl = {true, false};
        System.out.println("a) Rule of separability of alternatives in relation to conjunctions");
        System.out.println("|\tp\t|\tq\t|\tr\t|\tq ∧ r\t|\tp ∨ (q ∧ r)\t|\tp ∨ q\t" + "|\tq ∨ r\t|\t(p ∨ q) ∧ (p ∨ r)\t|\t[p ∨ (q ∧ r)] <=> [(p ∨ q) ∧ (p ∨ r)]\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl) {
                for (Boolean r : bl) {
                    System.out.println(" " + p + "\t" + " " + q + "\t" + " " + r + "\t\t" + (q && r) + "\t\t  "
                            + (p || (q && r)) + "\t\t\t" + (p || q) + "\t\t" + " " + (p || r) + " \t\t\t  "
                            + ((p || q) & (p || r)) + "\t\t\t\t\t\t\t" + ((p || (q && r)) == ((p || q) & (p || r))));
                }
            }

        }
        System.out.println("Conclusion: Rule of separability of alternatives in relation to conjunctions is law.");

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nb) Rule of separability of conjunctions in relation to alternatives");
        System.out.println("|\tp\t|\tq\t|\tr\t|\tq ∨ r\t|\tp ∧ (q ∨ r)\t|\tp ∧ q\t" +
                "|\tq ∧ r\t|\t(p ∧ q) ∨ (q ∧ r)\t|\t[p ∧ (q ∨ r)] <=> [(p ∧ q) ∨ (q ∧ r)]\t|");
        for (Boolean p : bl) {
            for (Boolean q : bl) {
                for (Boolean r : bl) {
                    System.out.println(" " + p + "\t" + " " + q + "\t" + " " + r + "\t\t " + (q || r) + "\t\t  "
                            + (p && (q || r)) + "\t\t\t" + (p && q) + "\t\t" + " " + (p && r) + " \t\t\t"
                            + ((p && q) || (p && r)) + "\t\t\t\t\t\t\t" + ((p && (q || r)) == ((p && q) || (p && r))));
                }

            }
        }
        System.out.println("Conclusion: Rule of separability of conjunctions in relation to alternatives is law.");
    }
}
