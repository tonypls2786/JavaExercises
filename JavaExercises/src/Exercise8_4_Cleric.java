// 練習問題8-4
// 練習問題8-3で作成したClericクラスに自分のMPを祈った秒数に0〜2ポイント補正を加えた量回復する「pray()」メソッドを追加する。
// ただし、最大MPを超えて回復することはない。また、このメソッドは引数に「祈る秒数」を指定して、戻り値に「実際に回復したMP量」を指定する。
public class Exercise8_4_Cleric {
	String name;
	final int MAXHP = 50;
	int hp = 50;
	final int MAXMP = 10;
	int mp = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}

// 追加 start
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
// 追加 end
}
