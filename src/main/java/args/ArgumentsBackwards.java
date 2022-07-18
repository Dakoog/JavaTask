package args;

public class ArgumentsBackwards {
    public static void main(String[] args) {
        for (String arguments : args) {
            for (int i = arguments.length()-1; i>=0 ; --i){
                System.out.print(arguments.charAt(i));
            }
        }
    }
}
