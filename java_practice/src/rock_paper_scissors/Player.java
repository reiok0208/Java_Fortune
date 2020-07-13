package rock_paper_scissors;

import java.util.Random;

public class Player {

	// 外部からの編集ができないようにprivateにしている
	private String name; /* メンバ変数(クラス変数) [privateなので外部から呼び出せない] */
	private Random random = new Random();

	public Player(String name) { /* コンストラクタ(new生成時に実行) */
		this.name = name;
	}

	public String getName() { /* getNameメソッド [publicなので外部から呼び出せる] */
		return this.name;
	}

	public Hand nextHand() { /* Handに戻る */
		int n = random.nextInt(3); /* Random.nextIntで0~2の乱数を取得 */
		return Hand.fromInt(n);
	}

}
