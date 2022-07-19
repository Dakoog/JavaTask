package logic;

public class DeMorgansLaw {
    //ʌ
    public static void main(String[] args) {
        boolean[] bool = {true, false};
        System.out.println();
        System.out.println("\t\t\tThe negation of the conjunction is equivalent an alternative to denial");
        System.out.println("|\tp \t|\tq \t|\tp ʌ q \t|\t~(p ʌ q )\t|\t~p\t|\t~q\t|\t ~p v ~q \t|\t~(p ʌ q ) <=> ~p v ~q \t|");
        for (boolean p : bool)
            for (boolean q : bool) {
                System.out.println(" " + p + " \t " + q + "\t\t" + (p && q) + " \t\t " + !(p && q) + " \t\t "
                        + !p + " \t " + !q + " \t\t " + (!p || !q) + " \t\t\t\t\t " + (!(p && q) == (!p || !q)));
            }
        System.out.println();
        System.out.println("\t\t\tThe negation of the alternative is equivalent a conjunction to denial");
        System.out.println("|\tp \t|\tq \t|\tp v q \t|\t~(p v q )\t|\t~p\t|\t~q\t|\t ~p ʌ ~q \t|\t~(p v q ) <=> ~p ʌ ~q \t|");
        for (boolean p : bool)
            for (boolean q : bool) {
                System.out.println(" " + p + " \t " + q + "\t\t" + (p || q) + " \t\t " + !(p || q) + " \t\t "
                        + !p + " \t " + !q + " \t\t " + (!p && !q) + " \t\t\t\t\t " + (!(p || q) == (!p && !q)));
            }
    }
}