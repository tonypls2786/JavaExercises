
public class Exercise5_3 {
	// 練習問題5-3
	// 以下の仕様を参考に、練習5-2のコードにメソッド「email」をオーバーロードして、mainメソッドから呼び出し。
	// 以下、「email」の仕様
	// メソッド名:email
	// 戻り値の型:なし
	// 引数リスト:メールの宛先アドレス（String address）、メールの本文（String text）
	// 処理内容:以下の形式で表示を行う
	// メールの宛先アドレスに、以下のメールを送信しました
	// 件名：無題
	// 本文：メールの本文
// 以下、練習5-2の記述
	public static void main(String[] args) {
		String strTitle = "タイトル";
		String strAddress = "アドレス";
		String strText ="ーー本文ーー";

// 練習5-2から修正 start
//		email(strTitle, strAddress, strText);
		email(strAddress, strText);

	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
// 以上、練習5-2の記述

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
}
