package inputOutput.dateTime;

import java.util.Date;

public class OperationTime {
    public static void main(String[] args) {
        // System.currentTimeMillis() -> number milliseconds since 1.01.197r
        double convertToYear = System.currentTimeMillis() / (1000 * 3600 * 24 * 365.23);
        int numberYears = (int) (convertToYear);
        int numberDays = (int) ((convertToYear - numberYears) * 365);
        System.out.println(numberYears + " years and " + numberDays + " days has passed from  1.01.1970y to co. ");

        // exponential note
        double ten10 = 1E1;
        double hundred100 = 1E2;
        double thousand1000 = 1E3;
        double million1000000 = 1E6;
        System.out.println(ten10);
        System.out.println(hundred100);
        System.out.println(thousand1000);
        System.out.println(million1000000);

        // measuring the passing time
        long t1 = System.currentTimeMillis();

        for (int i = 0; i < 1E9; i++) {
            double x = Math.pow(Math.random(), Math.random()); // Math.random -

        }
        long t2 = System.currentTimeMillis();
        long passingTime = (t2 - t1) / 1000;

        System.out.println("duration of operation " + passingTime+" sec.");
    }

}
