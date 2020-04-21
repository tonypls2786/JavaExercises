// 練習問題11-1
// Computerクラス
public class Exercise11_1_ComputerAnswer extends Exercise11_1_TangibleAsset{
	String makerName;
	// コンストラクタ
	public Exercise11_1_ComputerAnswer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	// メソッド
	public String getMakerName() { return this.makerName; }
}
