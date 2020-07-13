package rock_paper_scissors;

public enum Hand { /* 列挙型enum */
	Rock,
	Scissors,
	Paper;

	@Override /* メソッドの上書きが可能 */
	public String toString() { /* toStringメソッドはRailsでいうto_sメソッド */
		switch(this) { /* thisは自クラス */
		case Rock: return "👊";
		case Scissors: return "✌️";
		case Paper: return "✋";
		}
		throw new IllegalStateException();
	}

	public static Hand fromInt(int n) {
		switch(n % 3) {
		case 0: return Hand.Rock;
		case 1: return Hand.Scissors;
		case 2: return Hand.Paper;
		}
		throw new IllegalArgumentException(Integer.toString(n));
	}

	public boolean winTo(Hand hand) {
		switch(this) {
		case Rock: return hand == Scissors;
		case Scissors: return hand == Paper;
		case Paper: return hand == Rock;
		}
		throw new IllegalStateException();
	}

	public boolean loseTo(Hand hand) {
		return this != hand && !winTo(hand);
	}
}
