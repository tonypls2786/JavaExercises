// 練習問題17-3
// Integer.parseIntメソッドを実行し、文字列"三"の変換結果をint型変数iに代入するコードを記述。
// その際に、parseIntメソッドがどのような例外を発生させる可能性があるかを調べて、正しく例外処理を行う。
public class Exercise17_3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}
	}

}
