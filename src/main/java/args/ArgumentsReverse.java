package args;
/*Napisz program, który uruchomiony z kilkoma argumentami
 wypisze listę argumentów, oddzielonych odstępami, w odwrotnej kolejności*/
public class ArgumentsReverse {
    public static void main(String[] args) {
        for (int i = args.length-1; i >=0 ; --i) {
            System.out.println(args[i]+"  ");
    }
}}

