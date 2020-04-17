
public class Exercise6_1 {
	// 練習問題6-1
	// 次のソースコードを次のルールに従って3つに分割する。
	// ①commentパッケージに属するZenhanクラスを作成し、前半に実行される2つのメソッドを移動する。
	// ②commentパッケージに属するKouhanクラスを作成し、後半に実行される2つのメソッドを移動する。
	// ③デフォルトパッケージに属するMainクラスにはmainメソッドだけを残す。そして、このクラスの先頭では、Zenhanクラスだけをインポートする。
	// 以下、問題ソースコード
	public static void main(String[] args) throws Exception{
		// 前半
		doWarusa();
		doTogame();
		// 後半
		callDeae();
		showMondokoro();
	}
	public static void doWarusa() {
		System.out.println("きなこでござる。食えませんがの。");
	}
	public static void doTogame() {
		System.out.println("この老いぼれの目はごまかせませんぞ。");
	}
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}
	public static void showMondokoro() throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目にはいらぬか！");
		doTogame();
	}
}
