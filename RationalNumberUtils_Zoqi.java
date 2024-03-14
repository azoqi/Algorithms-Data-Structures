package rationalnumbers;

public class RationalNumberUtils_Zoqi {
	// Adds two rational numbers and returns the result
    public static RationalNumber add(RationalNumber r1, RationalNumber r2) {
        int numerator = r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getDenominator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Zoqi(numerator, denominator);
    }

    // Subtracts two rational numbers and returns the result
    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {
        int numerator = r1.getNumerator() * r2.getDenominator() - r2.getNumerator() * r1.getDenominator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Zoqi(numerator, denominator);
    }

    // Multiplies two rational numbers and returns the result
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
        int numerator = r1.getNumerator() * r2.getNumerator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Zoqi(numerator, denominator);
    }

    // Divides two rational numbers and returns the result
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2) {
        int numerator = r1.getNumerator() * r2.getDenominator();
        int denominator = r1.getDenominator() * r2.getNumerator();
        return new RationalNumberImpl_Zoqi(numerator, denominator);
    }

    // Negates a rational number and returns the result
    public static RationalNumber negate(RationalNumber r) {
        return new RationalNumberImpl_Zoqi(-r.getNumerator(), r.getDenominator());
    }

    // Checks if two rational numbers are equal
    public static boolean equal(RationalNumber r1, RationalNumber r2) {
        return r1.getNumerator() == r2.getNumerator() && r1.getDenominator() == r2.getDenominator();
    }

}
