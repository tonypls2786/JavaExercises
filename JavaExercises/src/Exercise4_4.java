
public class Exercise4_4 {
	// 練習問題4-4
	// 以下の条件を満たす「数あてクイズ」のプログラムを作成
	// ①int型で要素数3の配列numbersを準備する。この時の初期値はそれぞれ「3」「4」「9」とする。
	// ②画面に「1桁の数字を入力してください」と表示する。
	// ③次のコードを用いてキーボードから数字の入力を受け付け、変数inputに代入。
	// ④配列をループで回していずれかの要素と等しいかを比べ、等しければ「アタリ！」と表示する。
	public static void main(String[] args) {
		// ①
		int[] numbers = {3, 4, 9};

		// ②
		System.out.println("1桁の数字を入力してください");
		System.out.print(">>");

		// ③
		int input = new java.util.Scanner(System.in).nextInt();

		// ④
		for(int i = 0; i < numbers.length; i++) {
			if(input == numbers[i]) {
				System.out.println("アタリ！");
				break;
			}
		}
	}

}
