package labNumber14;

public enum Roshambo {
	
	ROCK, PAPER, SCISSORS;
	
	public String toString() {
		switch (this) {
		case ROCK:
			return "ROCK";
		case PAPER:
			return "PAPER";
		
		default:
			return "SCISSORS";
		}
	}

}
