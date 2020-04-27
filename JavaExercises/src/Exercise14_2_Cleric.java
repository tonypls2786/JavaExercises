// 練習問題14-2
// 第8章の練習問題で作成したClericクラスでは、各インスタンスごとに最大HPと最大MPんお情報を保持している。
// 全てのClericの最大HPは50、最大MPは10と決まっており、各インスタンスがそれぞれ情報を持たないようにしたい。
// そこで、最大HP、最大MPのフィールドが各インスタンに保持されないようにフィールド宣言に適切なキーワードを追加。
public class Exercise14_2_Cleric {
	String name;
// 修正 start
// 	final int MAXHP = 50;
	static final int MAXHP = 50;
// 修正 end
	int hp = 50;
	// 修正 start
// 	final int MAXMP = 10;
	static final int MAXMP = 10;
	// 修正 end
	int mp = 10;
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}
	public int pray(int sec) {
		int healPoint;
		int point;
		point = new java.util.Random().nextInt(3);
		if(this.mp + sec + point > this.MAXMP) {
			healPoint = this.MAXMP - this.mp;
		}else {
			healPoint = sec + point;
		}
		this.mp += healPoint;
		return healPoint;
	}
}
