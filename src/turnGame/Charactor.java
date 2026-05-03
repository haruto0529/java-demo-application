package turnGame;

public class Charactor {
	protected String name;
	protected int hp;
	protected int atk;
	protected boolean isCharging;


	public Charactor(String name, int hp, int atk) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.isCharging = false;
	}

	//受けたダメージ分hp減らす
	public void takeDamage(int damage) {
		this.hp -= damage;
	}

	//生きているかどうか
	public boolean isArive(){
		return this.hp > 0;
	}

	
	
	public boolean isCharging() {
		return isCharging;
	}
	public void setCharging(boolean isCharging) {
		this.isCharging = isCharging;
	}
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
}
