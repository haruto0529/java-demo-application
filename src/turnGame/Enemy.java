package turnGame;

import java.util.Random;

public class Enemy extends Charactor {
	

	public Enemy(int hp, int atk) {
		super(hp, atk);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public Action act() {
		System.out.println("敵の行動");;
		Random r = new Random();
		int actNum = r.nextInt(2) + 1;
		Action act = Action.fromNumber(actNum);
		System.out.println(act);
		return act;
	}

}
