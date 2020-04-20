// 練習問題9-2
// 練習問題9-1のTheifクラスを利用するような次のプログラムがある。
// このプログラムの実行結果と、そのように表示される理由を「参照」という言葉を用いて説明。
// 以下、解答
// 実行結果:
// 25 : 25
// 25 : 35
// 理由：
// 1回目のhealの呼び出しではint型の変数baseHpを値渡ししており、baseHpの値は変わらない。
// また、2回目のhealの呼び出しではクラスThiefを表す変数tを参照渡しによって、t.hpとthief.hpが同じアドレスを指すようになる。
// そのため、thief.hpに代入した値がt.hpにも反映されているように見える。
// 以上、解答
public class Exercise9_2 {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Exercise9_1_Thief thief) {
		thief.hp += 10;
	}
	public static void main(String[] args) {
		int baseHp = 25;
		Exercise9_1_Thief t = new Exercise9_1_Thief("アサカ", baseHp);
		System.out.println(baseHp + " : " + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp);
	}
}
