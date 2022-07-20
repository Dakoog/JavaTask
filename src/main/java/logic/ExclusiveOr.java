package logic;

// 6.5.
//Napisz program, który przedstawi tabelę wartości logicznych alternatywy wykluczającej
public class ExclusiveOr
{

    public static void main(String[] args) {

        Boolean[] bl = {true, false};

        System.out.println();
        // first variant - full
        System.out.println("\t\t\t\t\tExclusive Or (p ⊕ q).");
        System.out.println("|\tp \t|\tq \t|\tp ∨ q \t|\t p ∧ q\t|\t∼( p ∧ q)\t|\t(p ∧ q) ∧ ∼( p ∧ q)\t|");

        for (Boolean p : bl) {
            for (Boolean q : bl){
                System.out.println(" " + p + "\t" + " " + q + "\t" + "\t" + (p || q) + "\t" + "\t" + (p && q) + "\t" + "\t" + !(p && q) + " \t\t\t\t" + " " + ((p || q) && !(p && q)));
        // second variant - operator (XOR) _ (^)
//        System.out.println("\t\t\t\t\tExclusive Or (p ^ q).");
//        System.out.println("|\tp \t|\tq \t|\tp ^ q \t|");
//        for (Boolean p : bl) {
//            for (Boolean q : bl) {
//
//                System.out.println(p + "\t " + q + "\t\t" + (p ^ q));
//            }
//       //third variant - operator (!=)
//        System.out.println("\t\t\t\t\tExclusive Or (p != q).");
//        System.out.println("|\tp \t|\tq \t|\tp ^ q \t|");
//
//        for (Boolean p : bl) {
//            for (Boolean q : bl) {
//                System.out.println(p + "\t " + q + "\t\t" + (p != q));
          }
        }
        System.err.println(" Conclusion: The exclusive or is only true when only one sentence is true");
    }
}
