
public class Exercise4_2 {
	// 練習問題4-2
	// 以下に示す3つの条件を満たすプログラムの作成
	// ①3つの口座残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言します。
	// ②その配列の要素を1つずつfor文で取り出して画面に表示します。
	// ③同じ配列の要素を拡張for文で1つずつ取り出して画面に表示します。
	public static void main(String[] args) {
		// ①
		int moneyList[] = {121902, 8302, 55100};

		// ②
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		// ③
		for(int money: moneyList) {
			System.out.println(money);
		}

	}

}
