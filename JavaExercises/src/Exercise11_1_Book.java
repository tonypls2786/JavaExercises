// 練習11-1
// 会社の資産として保有するものを管理するプログラムを作成しようとしている。
// 現時点では「コンピュータ」「本」を表す2つのクラス「Computer」「Book」がある。
// 今後、コンピュータと本以外にも様々な資産を管理していく場合に有用な「有形資産（TangibleAsset）」という抽象クラスを作成する。
// また、この時ComputerクラスとBookクラスはその親クラスを用いた形に修正。
// 以下、問題文のBookクラス
public class Exercise11_1_Book {
	String name;
	int price;
	String color;
	String isbn;
	// コンストラクタ
	public Exercise11_1_Book(String name, int price, String color, String isbn) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.isbn = isbn;
	}
	// メソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
	public String getIsbn() { return this.isbn; }
}