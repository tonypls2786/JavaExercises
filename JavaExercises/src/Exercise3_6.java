
public class Exercise3_6 {
	// 練習問題3-6
	// 問題文に沿って記述
	public static void main(String[] args) {
		// 変数宣言部
		int ans;
		int num;

		// ①画面に「【数あてゲーム】」と表示する。
		System.out.println("【数あてゲーム】");

		// ②0から9までの整数の中からランダムな数を1つ生成して変数ansに代入する。
		ans = new java.util.Random().nextInt(9);

		// ③for文を用いた「5回繰り返すループ」を作る。その際に以下の④〜⑦は、ループの中に記述する。
		for(int i = 0; i < 5; i++) {

			// ④画面に「0〜9の数字を入力してください」と表示する。
			System.out.println("0〜9の数字を入力してください");
			System.out.print(">>");

			// ⑤数字を入力し、変数numに代入する。
			num = new java.util.Scanner(System.in).nextInt();

			// ⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して繰り返しを終了する。
			// ⑦もし変数numが変数ansと等しくない場合は「違います」と表示する。
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("違います");
			}
		}

		// ⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する。
		System.out.println("ゲームを終了します");
	}
}
