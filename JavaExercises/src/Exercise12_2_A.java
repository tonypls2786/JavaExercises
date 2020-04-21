// 練習問題12-2
// 以下の問いに答える。
// ①「X obj = new A();」としてAインスタンスを生成した後、変数objに対して呼ぶことができるメソッドを、a()、b()、c()の中から全て挙げる。
// ②「Y y1 = new A(); Y y2 = new B();」としてAとBのインスタンスを生成した後、「y1.a(); y2.a();」を実行した場合に画面に表示される内容を示す。
// 解答は「練習問題解答xlsx」に記載
// 以下、Aクラス
public final class Exercise12_2_A extends Exercise12_2_Y{
	public void a() { System.out.print("Aa"); }
	public void b() { System.out.print("Ab"); }
	public void c() { System.out.print("Ac"); }
}
