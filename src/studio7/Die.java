
import java.util.Random;

public class Die {
	private final int sides;
	private final Random rng;

	public Die(int sides) {
		if (sides < 1) {
			throw new IllegalArgumentException("Die must have at least one side");
		}
		this.sides = sides;
		this.rng = new Random();
	}

	public int roll() {
		return rng.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	@Override
	public String toString() {
		return "Die[sides=" + sides + "]";
	}
}