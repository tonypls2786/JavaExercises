// 練習問題8-3
// 練習問題8-2で作成したClericクラスにMPを5消費することで自分自身のHPを最大HPまで回復することができる
// 「selfAid()」というメソッドを追加。このメソッドは引数なしで、戻り値もなし。
public class Exercise8_3_Cleric {
	String name;
	final int MAXHP = 50;
	int hp = 50;
	final int MAXMP = 10;
	int mp = 10;

// 追加 start
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}
// 追加 end
}
