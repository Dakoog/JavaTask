package fractions;


import java.math.BigDecimal;
import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

// constructors
    public Fraction(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Parametr b = 0!");
        }
        if (b < 0) {
            this.numerator = -a;
            this.denominator = -b;
        } else {
            this.numerator = a;
            this.denominator = b;
        }

    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int m) {
        this.numerator = m;
        this.denominator = 1;
    }
    // fraction in different notations
    public Fraction(String str) {
        int i = str.indexOf('.');
        if (i == -1) {
            i = str.indexOf(',');
        }

        if (i == -1) {
            i = str.indexOf('/');
            if (i == -1) {
                this.numerator = Integer.parseInt(str);
                this.denominator = 1;
            } else {
                this.numerator = Integer.parseInt(str.substring(0, i));
                this.denominator = Integer.parseInt(str.substring(i + 1));
                if (this.denominator == 0)
                    throw new ArithmeticException("Don't divide by 0!");
            }
        } else {
            this.numerator = Integer.parseInt(str.substring(0, i) +
                    str.substring(i + 1));
            int k = str.length() - i;
            this.denominator = 1;
            int n = 1;
            while (n++ < k)
                this.denominator *= 10;
        }

        this.reducingFraction();

    }

// gets and setts

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

// arithmetic actions

    public Fraction addingFractions(Fraction y) {
        return new Fraction(numerator * y.denominator + denominator * y.numerator, y.denominator * denominator).reducingFraction();
    }

    public Fraction addingFractions(int c) {
        return new Fraction(c * denominator + numerator, denominator).reducingFraction();
    }

    public Fraction subtractionFractions(Fraction y) {
        return new Fraction(numerator * y.denominator - denominator * y.numerator, y.denominator * denominator).reducingFraction();
    }

    public Fraction subtractionFromInteger(int c) {

        return new Fraction(c * denominator - numerator, denominator).reducingFraction();
    }

    public Fraction subtractionIntegerFrom(int c) {

        return new Fraction(numerator - c * denominator, denominator).reducingFraction();
    }

    public Fraction multiplyFractions(Fraction y) {
        return new Fraction(this.numerator * y.numerator, this.denominator * y.denominator).reducingFraction();
    }

    public Fraction multiplyFractions(int c) {
        return new Fraction(c * numerator, denominator).reducingFraction();
    }

    public Fraction divisionFractions(Fraction y) {

        return new Fraction(this.numerator * y.denominator, this.denominator * y.numerator).reducingFraction();
    }

    public Fraction divisionFromInteger(int c) {
        return new Fraction(c * denominator, numerator).reducingFraction();
    }

    public Fraction divisionIntegerFrom(int c) {
        return new Fraction(numerator, c * denominator).reducingFraction();
    }

    public Fraction reducingFraction() {

        int divide = Utils.GCD(numerator, denominator);
        if (divide > 1) {
            this.numerator = numerator / divide;
            this.denominator = denominator / divide;
        }
        return this;
    }

    public Fraction fractionInverse() {
        return new Fraction(this.denominator, this.numerator);
    }

    public String mixedNumber() {
        Fraction x = new Fraction(numerator, denominator);

        int rest = numerator % denominator;
        int counter = numerator / denominator;
        if (rest == 0) {
            return String.valueOf(counter);
        } else {

            Fraction y = new Fraction(numerator, denominator);
            if (counter != 0) {
                if (rest < 0) {
                    y = new Fraction(-rest, denominator);

                    return "(%d %s)".formatted(counter, y);
                } else {
                    y = new Fraction(rest, denominator);
                    return "%d %s".formatted(counter, y);
                }


            } else
                return "%s".formatted(y);
        }


    }

    public Fraction changeToImproperFraction(int a, Fraction x) {
        if (a < 0) return new Fraction(a * denominator - numerator, denominator);
        return new Fraction(a * denominator + numerator, denominator);
    }

    public double changeToDecimal(Fraction x) {
        return Math.round(1000000 * (numerator / (double) denominator)) / 1000000d;
    }


    public Fraction abs() {
        if (numerator < 0) {
            return new Fraction(-numerator, denominator);
        }
        return this;
    }

    public boolean isUpper(Fraction b) {
        return numerator * b.denominator > denominator * b.numerator;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        Fraction x = new Fraction(numerator, denominator);
        Fraction y = new Fraction(fraction.numerator, fraction.denominator);
        x.reducingFraction();
        y.reducingFraction();

        return x.numerator == y.numerator && x.denominator == y.denominator;
    }


    @Override
    public int hashCode() {
        Fraction x = new Fraction(numerator, denominator);
        x.reducingFraction();
        return Objects.hash(x.numerator, x.denominator);
    }

    @Override
    public String toString() {
        if (numerator % denominator == 0) {
            return String.valueOf(numerator / denominator);
        } else if (numerator == 0) {
            return "0";
        } else {
            return numerator + "/" + denominator;
        }

    }
}
