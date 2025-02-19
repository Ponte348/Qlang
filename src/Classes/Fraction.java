package Classes;

public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public static Fraction add(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator
                + fraction2.numerator * fraction1.denominator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction subtract(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator
                - fraction2.numerator * fraction1.denominator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction multiply(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.numerator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction divide(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator;
        int newDenominator = fraction1.denominator * fraction2.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (this.denominator == 0) {
            return "null";
        }
        return ((double) this.numerator / this.denominator) * 100 + "%";
    }
}