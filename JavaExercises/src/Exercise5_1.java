
public class Exercise5_1 {
	// 練習問題5-1
	// 以下の仕様を参考にメソッド「introduceOneself」を定義する。
	// また、定義したメソッドをmainメソッドから呼び出す。
	// 以下、「introduceOneself」の仕様
	// メソッド名:introduceOneself
	// 戻り値の型:なし
	// 引数リスト:なし
	// 処理内容:名前（文字列）、年齢（整数）、身長（浮動小数点）、十二支（1文字）を代入する変数を宣言して値を代入する。
	// 変数を利用して自己紹介をする。表示するデータの中身や表示の仕方は自由とする。
	public static void main(String[] args) {
		introduceOneself();

	}

	public static void introduceOneself() {
		String name = "大谷晋太郎";
		int age = 25;
		float height = 200.0F;
		char zodiac = '戌';

		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳で、干支は" + zodiac + "。身長は" + height + "cmです。");
	}

}
