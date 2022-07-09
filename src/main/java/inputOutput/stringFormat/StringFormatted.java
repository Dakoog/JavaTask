package inputOutput.stringFormat;

public class StringFormatted {/*
%a  |	floating point (except BigDecimal)	                | Hex output of floating point number
%b  |	Any type	                                        | “true” if non-null, “false” if null
%c  |	character	                                        | Unicode character
%d  |	integer (incl. byte, short, int, long, bigint)	    | Decimal Integer
%e  |	floating point	                                    | decimal number in scientific notation
%f  |	floating point	                                    | decimal number
%g  |	floating point	                                    | decimal number, possibly in scientific
%h  |	any type	                                        | Hex String of value from hashCode() method.
%n  |	none	                                            | Platform-specific line separator.
%o  |	integer (incl. byte, short, int, long, bigint)	    | Octal number
%s  |	any type	                                        | String value
%t  |	Date/Time                                           | %t is the prefix for Date/Time conversions.
%x  |	integer (incl. byte, short, int, long, bigint)      | Hex string.*/

    public static void main(String[] args) {
        Cat blue = new Cat("Blue", "European Cat", 6, 750.5, 'F');
        Cat mefisto = new Cat("Mefisto", "British Shorthair", 2, 1700, 'M');
        char currency ='$';

        String myCat = String.format("The name of my cat is %s, and it race is %s. It sex is %c and it is %d years old. \nI bought him for the price %.2f%c.%n",
                blue.getName(), blue.getRace(), blue.getSex(), blue.getAge(), blue.getValue(),currency);
        System.out.println(myCat);

        System.out.printf("The name of my cat is %s, and it race is %s. It sex is %c and it is %d years old. \nI bought him for the price %.2f%c.%n",
                mefisto.getName(), mefisto.getRace(), mefisto.getSex(), mefisto.getAge(), mefisto.getValue(),currency);
    }
}
