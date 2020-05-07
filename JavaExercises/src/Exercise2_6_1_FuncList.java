// 練習問題6-1
// 次のコードに含まれる2つのメソッドを関数として変数に格納し、呼び出すプログラム（クラス名：Main）を作成。
// その際、関数を代入するためのインターフェースFunc1とFunc2を定義。
public class Exercise2_6_1_FuncList {
	public static boolean isOdd(int x) { return (x % 2 == 1); }
	public String addNamePrefix(boolean male, String name) {
		if(male == true) { return "Mr." + name; }
		else { return "Ms." + name; }
	}
}
