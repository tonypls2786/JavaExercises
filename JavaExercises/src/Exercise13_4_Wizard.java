// 練習問題13-4
// 練習問題13-3で作成したWizardクラスとWandクラスのsetterメソッドについて、次の4つのルールに従って引数の妥当性検証を追加。
// 引数が妥当でない場合は、「throw new IllegalArgumentException」を用いて何らかのエラーメッセージを表示してプログラムを中断する。
// 以下、ルール
// ①魔法使いや名前には、必ず3文字以上を指定する。
// ②杖による増幅率は、0.5以上100以下である。
// ③魔法使いは必ず杖を装備する。
// ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値をセットしようとした場合には、自動的に0が設定される。
public class Exercise13_4_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Exercise13_4_Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;										// 基本回復ポイント
		int recovPoint = (int)(basePoint * this.getWand().getPower());	// 杖による増幅
		h.setHp(h.getHp() + recovPoint);						// 勇者のHPを回復する
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	public int getHp() { return this.hp; }
// 修正 start
// 	public void setHp(int hp) { this.hp = hp; }
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	// 修正 end
	public int getMp() { return this.mp; }
// 修正 start
// 	public void setMp(int mp) { this.mp = mp; }
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("魔力に設定されている値が異常です");
		}
		this.mp = mp;
	}
// 修正 end
	public String getName() {return this.name; }
// 修正 start
// 	public void setName(String name) { this.name = name; }
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前に設定されている値が異常です");
		}
		this.name = name;
	}
// 修正 end
	public Exercise13_4_Wand getWand() { return this.wand; }
// 修正 start
//	public void setWand(Exercise13_4_Wand wand) { this.wand = wand; }
	public void setWand(Exercise13_4_Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("設定されている杖がnullです");
		}
		this.wand = wand;
	}
// 修正 end
}

