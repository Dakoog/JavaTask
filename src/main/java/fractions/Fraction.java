package fractions;

public class Fraction {
    private int numerator;
    private int denominator;

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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction addingFractions(Fraction y) {
        return new Fraction(numerator * y.denominator + denominator * y.numerator, y.denominator * denominator);
    }

    public Fraction subtractionFractions(Fraction y) {
        return new Fraction(numerator * y.denominator - denominator * y.numerator, y.denominator * denominator);
    }

    public Fraction multiplyFractions(Fraction y) {
        return new Fraction(this.numerator * y.numerator, this.denominator * y.denominator);
    }

    public Fraction divisionFractions(Fraction y) {

        return new Fraction(this.numerator * y.denominator, this.denominator * y.numerator);
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
                    return "(%d %s)".formatted(counter, y);
                }


            } else
                return "(%s)".formatted(y);
        }


    }

    public Fraction changeToImproperFraction(int a, Fraction x) {
        if (a < 0) return new Fraction(a * denominator - numerator, denominator);
        return new Fraction(a * denominator + numerator, denominator);
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
