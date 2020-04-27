// 練習問題13-3
// 練習問題13-1で作成したプログラムのコンパイルエラーを回避するために、gettersetterを作成。
public class Exercise13_3_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Exercise13_3_Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;										// 基本回復ポイント
// 修正 start
//		int recovPoint = (int)(basePoint * this.wand.power);	// 杖による増幅
		int recovPoint = (int)(basePoint * this.getWand().getPower());	// 杖による増幅
// 修正 end
		h.setHp(h.getHp() + recovPoint);						// 勇者のHPを回復する
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
// 追加 start
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
	public int getMp() { return this.mp; }
	public void setMp(int mp) { this.mp = mp; }
	public String getName() {return this.name; }
	public void setName(String name) { this.name = name; }
	public Exercise13_3_Wand getWand() { return this.wand; }
	public void setWand(Exercise13_3_Wand wand) { this.wand = wand; }
// 追加 end
}

