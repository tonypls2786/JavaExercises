// 練習問題13-1
// 次の2つのクラスWizard（魔法使い）とWand（杖）に宣言されている全てのフィールドとメソッドについて、カプセル化の定石に従ってアクセス修飾子を追加。
// Heroクラス、Mainクラスは別で定義しているものとする。
// 以下、クラスWizard
public class Exercise13_1_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Exercise13_1_Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;										// 基本回復ポイント
		int recovPoint = (int)(basePoint * this.wand.power);	// 杖による増幅
		h.setHp(h.getHp() + recovPoint);						// 勇者のHPを回復する
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
}
