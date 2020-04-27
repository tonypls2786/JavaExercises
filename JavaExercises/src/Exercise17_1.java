// 練習問題17-1
// 次のようなプログラムを作成し、実行時エラーを発生させる。
// ①String型変数sを宣言し、nullを代入する。
// ②s.length()の内容を表示しようとする。
public class Exercise17_1 {
	public static void main(String[] args) {
		String s = null;
		System.out.println(s.length());
	}
}
