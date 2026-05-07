package turnGame;

public enum Action {
	ATTACK(1),DIFFENSE(2),CHARGE(3);
	private final int action;

	private Action(int action) {
		this.action = action;
	}

	public static Action fromNumber(int num) {
		for (Action a : Action.values()) {
			if (a.action == num) {
				return a;
			}
		}
		return null;
	}
}
