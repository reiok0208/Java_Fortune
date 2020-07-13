package rock_paper_scissors;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("戸山");
		Player player2 = new Player("市ヶ谷");
		Hand hand1 = player1.nextHand();
		Hand hand2 = player2.nextHand();

		String result = hand1.winTo(hand2) ? player1.getName() + "の勝利" : /* 三項演算子を使用し、勝敗をresultへ */
						hand1.loseTo(hand2) ? player2.getName() + "の勝利" : "あいこ";

		System.out.println(
			String.format("%s: %s - %s :%s (%s)", /* 結果のフォーマット */
					player1.getName(), hand1, hand2, player2.getName(), result
			)
		);
	}

}
