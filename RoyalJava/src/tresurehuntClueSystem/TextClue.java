package tresurehuntClueSystem;

public class TextClue implements ClueProvider{

	String playerName;
	int levelNumber;
	String clue;
	
	public TextClue(String playerName, int levelNumber, String clue) {
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
