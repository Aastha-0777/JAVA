package tresurehuntClueSystem;

public class AudioClue implements ClueProvider{
	
	String playerName;
	int levelNumber;
	String clue;
	
	public AudioClue(String playerName, int levelNumber, String clue) {
		super();
		this.playerName = playerName;
		this.levelNumber = levelNumber;
		this.clue = clue;
	}

	@Override
	public void giveClue() {

		System.out.println(clue);

	}
	
	

}
