// 練習問題11-1
// TangibleAssetクラス
public abstract class Exercise11_1_TangibleAsset {
	String name;
	int price;
	String color;
	// コンストラクタ
	public Exercise11_1_TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	// メソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
}
