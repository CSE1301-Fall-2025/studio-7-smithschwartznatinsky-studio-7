
public class HockeyPlayer {
	private final String name;
	private final int jerseyNumber;
	// shooting capability
	private final boolean shootsLeft;
	private final boolean shootsRight;
	// handedness (left or right)
	private final String handedness;

	private int gamesPlayed = 0;
	private int goals = 0;
	private int assists = 0;

	public HockeyPlayer(String name, int jerseyNumber, String handedness, boolean shootsLeft, boolean shootsRight) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.handedness = handedness;
		this.shootsLeft = shootsLeft;
		this.shootsRight = shootsRight;
	}

	public String getName() { return name; }
	public int getJerseyNumber() { return jerseyNumber; }
	public String getHandedness() { return handedness; }
	public boolean canShootLeft() { return shootsLeft; }
	public boolean canShootRight() { return shootsRight; }

	public void recordGame(int goalsThisGame, int assistsThisGame) {
		if (goalsThisGame < 0 || assistsThisGame < 0) throw new IllegalArgumentException("Negative stats not allowed");
		this.gamesPlayed++;
		this.goals += goalsThisGame;
		this.assists += assistsThisGame;
	}

	public int getGamesPlayed() { return gamesPlayed; }
	public int getGoals() { return goals; }
	public int getAssists() { return assists; }
	public int getPoints() { return goals + assists; }

	@Override
	public String toString() {
		return String.format("HockeyPlayer[name=%s,jersey=%d,handedness=%s,shootsLeft=%b,shootsRight=%b,GP=%d,G=%d,A=%d,P=%d]",
			name, jerseyNumber, handedness, shootsLeft, shootsRight, gamesPlayed, goals, assists, getPoints());
	}
}