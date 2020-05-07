// 練習問題6-2
// 練習問題6-1におけるFuncListクラスの2つのメソッドの内容をそれぞれラムダ式で表現したものをFunc1とFunc2に代入する分を記述。
public class Exercise2_6_2 {
	public static void main(String[] args) {
		Func1 f1 = x -> x % 2 == 1;
		Func2 f2 = (male, name)->{
			if(male == true) { return "Mr." + name; }
			else { return "Ms." + name;}
		};
	}
}
