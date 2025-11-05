
public class Studio7Main {
	public static void main(String[] args) {
		// Rectangle
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(2, 2);
		System.out.println(r1 + " perimeter=" + r1.getPerimeter());
		System.out.println(r2 + " isSquare=" + r2.isSquare() + " smallerThan r1? " + r2.isSmallerThan(r1));

		// Die
		Die d6 = new Die(6);
		System.out.println("Rolling d6: " + d6.roll());

		// Fraction
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(3, 4);
		System.out.println(a + " + " + b + " = " + a.add(b));
		System.out.println(a + " * " + b + " = " + a.multiply(b));
		System.out.println("reciprocal of " + a + " = " + a.reciprocal());

		// Complex
		Complex c1 = new Complex(1.0, 2.0);
		Complex c2 = new Complex(3.0, -4.0);
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));

		// HockeyPlayer
		HockeyPlayer p = new HockeyPlayer("Smith", 12, "right", true, false);
		p.recordGame(2, 1);
		p.recordGame(0, 2);
		System.out.println(p);
	}
}