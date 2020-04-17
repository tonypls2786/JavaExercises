// 練習問題6-3
// showMondokoroメソッドを「この紋所が目にはいらぬか」の後に3秒間の待ち時間を設定
package comment;

public class Exercise6_3_Kohan {
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}
	public static void showMondokoro() throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目にはいらぬか！");
// 修正 start
		Thread.sleep(3000);
// 修正 end
		Exercise6_1_Zenhan.doTogame();
	}

}
