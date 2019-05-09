package labNumber14;

import java.util.Random;

public class PlayerTwo extends Player {

	@Override
	public Roshambo generateRoshambo() {

		Random random = new Random();
		int userNum = random.nextInt(3) + 1;

		if (userNum == 1) {
			return Roshambo.ROCK;
		} else if (userNum == 2) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}

	}

	public PlayerTwo() {
		super("Joker");
		
	}
	
}
