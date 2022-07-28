package date_time;

public class ValidationOfDate {
    public static boolean isDate(String yourDate) {
        char dot = '.';
        boolean isDate = yourDate.length() == 10 && (yourDate.charAt(2) == dot && yourDate.charAt(5) == dot);

        try {
            if (isDate) {
                int day = Integer.parseInt(yourDate.substring(0, 2));
                int month = Integer.parseInt(yourDate.substring(3, 5));
                int year = Integer.parseInt(yourDate.substring(6, 10));

                isDate = year > 2000 && year <= 2100
                        && month >= 1 && month <= 12
                        && day > 0 && day <= 31;

                switch (month) {
                    case 2 -> {
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year / 100 % 4 == 0))
                            isDate &= day <= 29;
                        else
                            isDate &= day <= 28;
                    }
                    case 4, 6, 9, 11 -> isDate = isDate && day <= 30;
                    default -> {
                    }
                }
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return isDate;
    }
}
