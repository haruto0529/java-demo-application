package turnGame;

public class BattleGame {
	private int turnCount;
	private Player player;
	private Enemy enemy;

	public BattleGame(int turnCount) {
		super();
		this.turnCount = turnCount;
		this.enemy = new Enemy();
		this.player = new Player();
	}
	

}
