// 練習問題6-1
// 次のコードに含まれる2つのメソッドを関数として変数に格納し、呼び出すプログラム（クラス名：Main）を作成。
// その際、関数を代入するためのインターフェースFunc1とFunc2を定義。
interface Func1{
	boolean call(int x);
}
interface Func2{
	String call(boolean male, String name);
}
public class Exercise2_6_1_Main {
	public static void main(String[] args) {
		Exercise2_6_1_FuncList funclist = new Exercise2_6_1_FuncList();
		Func1 f1 = Exercise2_6_1_FuncList::isOdd;
		Func2 f2 = funclist::addNamePrefix;
		System.out.println(f1.call(15));
		System.out.println(f2.call(true, "Smith"));
	}

}
