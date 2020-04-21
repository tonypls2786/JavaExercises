// 練習問題11-2
// 練習問題11-1の会社は無形資産も管理しようとしている。
// この時、有形資産にも無形資産にも継承できる抽象クラスを作成。
// また、このクラスを継承するようにTangibleAssetクラスを修正。
public abstract class Exercise11_2_Asset {
	String name;
	int price;
	// コンストラクタ
	public Exercise11_2_Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// メソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
}
