
public class Exercise2_3 {
	// 練習問題2-3
	// 問題文に沿ったプログラムの作成
	public static void main(String[] args) {
		// 変数宣言部
		String name;
		String ageString;
		int age;
		int fortune;

		// ①画面に「ようこそ占いの館へ」と表示します。
		System.out.println("ようこそ占いの館へ");
		// ②画面に「あなたの名前を入力してください」と表示します。
		System.out.println("あなたの名前を入力してください");
		System.out.print(">>");
		// ③キーボードから1行の文字入力を受け付け、String型の変数nameに格納します。
		name = new java.util.Scanner(System.in).nextLine();
		// ④画面に「あなたの年齢を入力してください」と表示します。
		System.out.println("あなたの年齢を入力してください");
		System.out.print(">>");
		// ⑤キーボードから1行の文字入力を受け付け、String型の変数ageStringに格納します。
		ageString = new java.util.Scanner(System.in).nextLine();
		// ⑥変数ageStringの内容をint型に変換し、int型の変数ageに代入します。
		age = Integer.parseInt(ageString);
		// ⑦0から3までの乱数を生成し、int型の変数fortuneに代入します。
		fortune = new java.util.Random().nextInt(3);
		// ⑧fortuneの数字をインクリメント演算子で1増やし、1から4の乱数にします。
		fortune++;
		// 画面に「占いの結果が出ました！」と表示します。
		System.out.println("占いの結果が出ました！");
		// ⑩画面に「（年齢）歳の（名前）さん、あなたの運気番号は（乱数）です」と表示します。
		System.out.printf("%d歳の%sさん、あなたの運気番号は%sです%n", age, name, fortune);
		// 11画面に「1:大吉2:中吉3:吉4:凶」と表示します。
		System.out.println("1:大吉2:中吉3:吉4:凶");
	}
}
