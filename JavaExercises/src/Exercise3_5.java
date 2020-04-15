
public class Exercise3_5 {
	// 練習問題3-5
	// 問題文に沿って記述
	public static void main(String[] args) {
		// 変数宣言部
		int selected;

		// ①画面に「[メニュー]1:検索2:登録3:削除4:変更>」と表示する。表示後は改行しないこと。
		System.out.print("[メニュー]1:検索2:登録3:削除4:変更>");

		// ②数字を入力し、変数selectedに代入する。
		selected = new java.util.Scanner(System.in).nextInt();

		// ③もし、変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と表示する。
		// ④selectedが1から4のいずれでもない場合は何もしない。
		switch(selected){
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
	}
}
