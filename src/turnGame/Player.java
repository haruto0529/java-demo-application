package turnGame;

import java.util.Scanner;

public class Player extends Charactor{

	private Scanner sc;
	private String name;
	public Player(String name,int hp, int atk) {
		super(hp, atk);
		// TODO 自動生成されたコンストラクター・スタブ
		
		this.name = name;
		this.sc = new Scanner(System.in);
	}
	
	public String getName() {
		return name;
	}
	
	
	public Action selectAction() {
		System.out.println("行動を選択してください");
		System.out.println("1,攻撃 2,防御 3,チャージ");
		int guess = sc.nextInt();
		Action act = Action.fromNumber(guess);
		System.out.println(act);
		return act;
	}

}
