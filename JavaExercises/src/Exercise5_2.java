
public class Exercise5_2 {
	// 練習問題5-2
	// 以下の仕様を参考にメソッド「email」を定義。
	// また、定義したメソッドをmainメソッドから呼び出す。
	// 以下、「email」の仕様
	// メソッド名:email
	// 戻り値の型:なし
	// 引数リスト:メールのタイトル（String title）、メールの宛先アドレス（String address）、メールの本文（String text）
	// 処理内容:以下の形式で表示を行う
	// メールの宛先アドレスに、以下のメールを送信しました
	// 件名：メールのタイトル
	// 本文：メールの本文
	public static void main(String[] args) {
		String strTitle = "タイトル";
		String strAddress = "アドレス";
		String strText ="ーー本文ーー";

		email(strTitle, strAddress, strText);

	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
