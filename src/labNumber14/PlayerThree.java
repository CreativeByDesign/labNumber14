package labNumber14;

public class PlayerThree extends Player {
	private char userChoice;

	@Override
	public Roshambo generateRoshambo() {
		if (userChoice == 'r') {
			return Roshambo.ROCK;
		} else if (userChoice == 'p') {
			return Roshambo.PAPER;
		} else if (userChoice == 's') {
			return Roshambo.SCISSORS;

		} else {
			return null;
		}

	}
}