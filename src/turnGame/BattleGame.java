package turnGame;

import java.util.Scanner;

public class BattleGame {
	private int turnCount;
	private Player player;
	private Enemy enemy;

	public BattleGame(String name) {
		super();
		this.enemy = new Enemy(100, 30);
		this.player = new Player(name, 100, 30);
	}

	public void result(Action playerAct, Action enemyAct) {
		//			プレイヤーが攻撃した場合
		if (playerAct == Action.ATTACK) {
			if (enemyAct == Action.DIFFENSE) {
				System.out.println("防御された！");
				checkHp();
			} else if (enemyAct == Action.ATTACK) {
				System.out.println(" 敵に " + player.getAtk() + " ダメージ！ ");
				enemy.takeDamage(player.getAtk());
				System.out.println(player.getName() + "は" + enemy.getAtk() + "ダメージうけた！");
				player.takeDamage(enemy.getAtk());
				checkHp();
			} else if (enemyAct == Action.CHARGE) {
				System.out.println(" 敵に " + player.getAtk() + " ダメージ！ ");
				enemy.takeDamage(player.getAtk());
				System.out.println("敵はパワーをチャージしている");
				enemy.chargePower();
				checkHp();
			}
		} else if (playerAct == Action.DIFFENSE) {
			if (enemyAct == Action.ATTACK) {
				System.out.println("敵の攻撃を防御！");
				checkHp();
			} else if (enemyAct == Action.DIFFENSE) {
				System.out.println("両者臆病者のようだ");
				checkHp();
			} else if (enemyAct == Action.CHARGE) {
				System.out.println("敵はパワーをチャージしている");
				enemy.chargePower();
				checkHp();
			}
		} else if (playerAct == Action.CHARGE) {
			if (enemyAct == Action.ATTACK) {
				System.out.println(player.getName() + "はパワーをチャージ!");
				player.chargePower();
				System.out.println(player.getName() + "は" + enemy.getAtk() + "ダメージうけた！");
				player.takeDamage(enemy.getAtk());
				checkHp();
			}else if (enemyAct == Action.DIFFENSE) {
				System.out.println("敵は守りを固めている");
				System.out.println(player.getName() + "はパワーをチャージ!");
				player.chargePower();
				checkHp();
			}else if (enemyAct == Action.CHARGE) {
				System.out.println("お互いにパワーをチャージ！");
				enemy.chargePower();
				player.chargePower();
				checkHp();
			}
		}

	}

	public void checkHp() {
		System.out.println("敵のHP:" + enemy.hp);
		System.out.println(player.getName() + "のHP:" + player.hp);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("名前を入力してね");
		String name = sc.nextLine();
		BattleGame game = new BattleGame(name);

		while (game.player.getHp() > 0 && game.enemy.getHp() > 0) {
			game.turnCount += 1;
			System.out.println(game.turnCount + "ターン目");
			System.out.println("-------------------------");
			Action playerAct = game.player.selectAction();
			Action enemyAct = game.enemy.act();

			game.result(playerAct, enemyAct);

		}

		sc.close();

	}
}
