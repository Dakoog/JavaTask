package trycatch;

public class Introduction {
    public static void main(String[] args) {
        // this is Arithmetic Exception -> division by zero
        //System.out.println(10/0);
        /* Exception in thread "main" java.lang.ArithmeticException: / by zero
           at try-catch.Introduction.main(Introduction.java:6)
           Process finished with exit code 1*/
        // if you want exit code 0, use a try-catch statement for that exception
        int a = 5;
        int b = 2;

        try{
            int quotient = divide(a, b);
            System.out.println(quotient);
        }catch (ArithmeticException ae){
            System.out.println("Don't division by zero!");
        }

    }

    private static int divide(int a, int b) throws ArithmeticException {

       return a/b;

    }

}
