
public class Exercise2_1 {
	// 練習問題2-1
	// 以下の記述で間違えているところを修正
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
// 修正 start
//		String ans = "x+yは" + x + y;
		String ans = "x+yは" + (x + y);
// 修正 end
		System.out.println(ans);
	}
}
