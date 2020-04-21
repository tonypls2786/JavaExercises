// 練習問題11-1
// Bookクラス
public class Exercise11_1_BookAnswer extends Exercise11_1_TangibleAsset{
	String isbn;
	// コンストラクタ
	public Exercise11_1_BookAnswer(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	// メソッド
	public String getIsbn() { return this.isbn; }
}
