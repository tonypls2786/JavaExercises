
public class Exercise3_3 {
	// 練習問題3-3
	// 問題文に沿って記述
	public static void main(String[] args) {
		// ①int型の変数inHungryを定義し、0か1を代入する（どちらを代入しても構わない）。
		// また、String型の変数foodを定義し、適当な食べ物の名前を代入する。
		int inHungry = 0;
		String food = "apple";

		// ②画面に「こんにちは」と表示する。
		System.out.println("こんにちは");

		// ③もし変数isHungryが0であれば「お腹がいっぱいです」、そうでなければ「はらぺこです」と表示する。
		// ④もし変数isHungryが空腹を示すならば、変数foodを利用して「〇〇をいただきます」と表示する。
		// （〇〇には食べ物の名前が入る）。
		if(inHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}

		// ⑤最後に「ごちそうさまでした」と表示する。
		System.out.println("ごちそうさまでした");
	}
}
