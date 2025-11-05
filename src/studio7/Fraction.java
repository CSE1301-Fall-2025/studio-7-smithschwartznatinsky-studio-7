
public class Fraction {
	private final int num;
	private final int den;

	public Fraction(int num, int den) {
		if (den == 0) throw new IllegalArgumentException("Denominator cannot be zero");
		// normalize sign so denominator always positive
		if (den < 0) {
			num = -num;
			den = -den;
		}
		this.num = num;
		this.den = den;
	}

	public int getNumerator() { return num; }
	public int getDenominator() { return den; }

	public Fraction add(Fraction other) {
		int numerator = this.num * other.den + other.num * this.den;
		int denominator = this.den * other.den;
		return new Fraction(numerator, denominator).simplify();
	}

	public Fraction multiply(Fraction other) {
		return new Fraction(this.num * other.num, this.den * other.den).simplify();
	}

	public Fraction reciprocal() {
		if (this.num == 0) throw new ArithmeticException("Cannot take reciprocal of zero");
		return new Fraction(this.den, this.num).simplify();
	}

	public Fraction simplify() {
		int g = gcd(Math.abs(num), den);
		return new Fraction(num / g, den / g);
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		return a == 0 ? 1 : a;
	}

	@Override
	public String toString() {
		if (den == 1) return Integer.toString(num);
		return num + "/" + den;
	}
}