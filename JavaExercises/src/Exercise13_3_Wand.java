// 練習問題13-3
// 練習問題13-1で作成したプログラムのコンパイルエラーを回避するために、gettersetterを作成。
public class Exercise13_3_Wand {
	private String name;	// 杖の名前
	private double power;	// 杖の魔力
// 追加 start
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	public double getPower() { return this.power; }
	public void setPower(double power) { this.power = power; }
// 追加 end
}
