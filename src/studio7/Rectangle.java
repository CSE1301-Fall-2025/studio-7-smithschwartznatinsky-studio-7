

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() { return length; }
	public double getWidth() { return width; }
	public void setLength(double length) { this.length = length; }
	public void setWidth(double width) { this.width = width; }

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public boolean isSmallerThan(Rectangle other) {
		return this.getArea() < other.getArea();
	}

	public boolean isSquare() {
		final double EPS = 1e-9;
		return Math.abs(length - width) < EPS;
	}

	@Override
	public String toString() {
		return String.format("Rectangle[length=%.4f,width=%.4f,area=%.4f]", length, width, getArea());
	}
}