package logic;
/*Napisz program, który w formie tabeli przedstawi dowód następujących praw logicznych:
a) prawo wyłączonego środka,
b) prawo niesprzeczności,
c) prawo podwójnego przeczenia*/
public class LogicalLaws {
    public static void main(String[] args) {

        boolean p = false;
        System.out.println("a) Law of the exclusive remedy:");
        System.out.println("!p || p = "+(!p ||  p));
        System.out.println("b) Law of non-contradiction:");
        System.out.println(("!(!p &&  p) = "+!(!p &&  p)));
        System.out.println("c) Law of double-negation:");
        System.out.println("!(!p) ==  p) = "+(!(!p) ==  p));
    }
}
