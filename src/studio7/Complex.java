
public class Complex {
	private final double re;
	private final double im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double real() { return re; }
	public double imag() { return im; }

	public Complex add(Complex other) {
		return new Complex(this.re + other.re, this.im + other.im);
	}

	public Complex multiply(Complex other) {
		double realPart = this.re * other.re - this.im * other.im;
		double imagPart = this.re * other.im + this.im * other.re;
		return new Complex(realPart, imagPart);
	}

	@Override
	public String toString() {
		return String.format("%.4f%+ .4fi", re, im);
	}
}