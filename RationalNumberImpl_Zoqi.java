package rationalnumbers;

public class RationalNumberImpl_Zoqi implements RationalNumber{
	private int numerator;
    private int denominator;

    // Constructor
    public RationalNumberImpl_Zoqi(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        // Handling negative denominators
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // Reducing the fraction to its simplest form
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public double getValue() {
        return (double) numerator / denominator;
    }

    // Additional private method to calculate the greatest common divisor
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
