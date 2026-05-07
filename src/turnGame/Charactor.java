package turnGame;

public class Charactor {
	protected int hp;
	protected int atk;
	protected boolean isCharging;

	public Charactor(int hp, int atk) {
		this.hp = hp;
		this.atk = atk;
		this.isCharging = false;
	}

	//与えたダメージ分hp減らす
	public void takeDamage(int damage) {
		damage = damageCalculate(damage);
		this.hp -= damage;
		this.isCharging = false;
	}

	private int damageCalculate(int damage) {
		if (isCharging == true) {
			return this.atk += 30;
		} else {
			return this.atk = 30;
		}

	}

	public void chargePower() {
		this.isCharging = true;
	}

	public boolean isCharging() {
		return isCharging;
	}

	public void setCharging(boolean isCharging) {
		this.isCharging = isCharging;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
}
