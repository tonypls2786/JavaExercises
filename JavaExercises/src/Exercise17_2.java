// 練習問題17-2
// 練習問題17-1で作成したコードを、try-catch文を用いて例外処理するような修正をする。
// また、例外処理では次の動作を行う。
// ①「NullPointerException例外をcatchしました」と表示する。
// ②「ーースタックトレース（ここから）ーー」と表示する。
// ③スタックトレースを表示する。
// ④「ーースタックトレース（ここまで）ーー」と表示する。
public class Exercise17_2 {
	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
	}
}
