// 練習問題10-3
// クラスMatangoを利用して、次の仕様に則ったPoisonMatangoクラスを作成。
// ア.おばけ毒キノコ（PoisonMatango）は、おばけキノコ（Matango）の中でも特に「毒攻撃」ができる。
// イ.PoinsonMatangoは以下のコードでインスタンス化できるクラスとする。
// PoinsonMatango pm = new PoisonMatango('A');
// ウ.PoisonMatangoは、毒を用いた攻撃が可能な残り回数をint型フィールドとして持っており、初期値は5である。
// エ.PoisonMatangoは、attackメソッドが呼ばれると次の内容の攻撃をする。
// ①「通常のおばけキノコ同様の攻撃」を行う。
// ②「毒攻撃の残り回数」が0でなければ、以下を追加で行う。
// ③画面に「さらに毒の胞子をばらまいた！」と表示
// ④勇者のHPの1/5に相当するポイントを勇者のHPから引き、そのポイントを示すように「〜ポイントのダメージ！」と表示する。
// ⑤「毒攻撃の残り回数」を1減らす。
public class Exercise10_3_PoisonMatango extends Exercise10_3_Matango{
	// ウ.
	int poisonCount = 5;
	// イ.
	public Exercise10_3_PoisonMatango(char suffix) {
		super(suffix);
	}
	// エ.
	public void attack(Hero h) {
		// ①
		super.attack(h);
		// ②
		if(this.poisonCount > 0) {
			// ③
			System.out.println("さらに毒の胞子をばらまいた！");
			// ④
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			// ⑤
			this.poisonCount--;
		}
	}
}
