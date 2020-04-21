// 練習問題11-4
// 有形資産（TangibleAsset）は資産（Asset）の一種でもあり、形ある物（Thing）でもある。
// この定義にそうようにTangibleAssetクラスを修正。
public class Exercise11_4_TangibleAsset extends Exercise11_2_Asset implements Exercise11_3_Thing{
	String color;
	double weight;
	// コンストラクタ
	public Exercise11_4_TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	// メソッド
	public String getColor() { return this.color; }
	public double getWeight() { return this.weight; }
	public void setWeight(double weight) { this.weight = weight; }
}
