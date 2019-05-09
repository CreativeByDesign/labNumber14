package labNumber14;

public abstract class Player {
	private String name;
	
	public Player() {
		
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	abstract Roshambo generateRoshambo();

}
