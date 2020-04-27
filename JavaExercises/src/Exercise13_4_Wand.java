// 練習問題13-4
// 練習問題13-3で作成したWizardクラスとWandクラスのsetterメソッドについて、次の4つのルールに従って引数の妥当性検証を追加。
// 引数が妥当でない場合は、「throw new IllegalArgumentException」を用いて何らかのエラーメッセージを表示してプログラムを中断する。
// 以下、ルール
// ①魔法使いや名前には、必ず3文字以上を指定する。
// ②杖による増幅率は、0.5以上100以下である。
// ③魔法使いは必ず杖を装備する。
// ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値をセットしようとした場合には、自動的に0が設定される。
public class Exercise13_4_Wand {
	private String name;	// 杖の名前
	private double power;	// 杖の魔力
	public String getName() { return this.name; }
// 修正 start
// 	public void setName(String name) { this.name = name; }
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前に設定されている値が異常です");
		}
		this.name = name;
	}
// 修正 end
	public double getPower() { return this.power; }
// 修正 start
// 	public void setPower(double power) { this.power = power; }
	public void setPower(double power) {
		if(power < 0.5 || 100 < power) {
			throw new IllegalArgumentException("杖の魔力に設定されている値が異常です");
		}
		this.power = power;
	}
// 修正 end
}
