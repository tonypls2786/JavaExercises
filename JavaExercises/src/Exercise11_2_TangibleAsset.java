// 練習問題11-2
// TangibleAssetクラス修正
public abstract class Exercise11_2_TangibleAsset extends Exercise11_2_Asset{
	String color;
	// コンストラクタ
	public Exercise11_2_TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	// メソッド
	public String getColor() { return this.color; }
}
