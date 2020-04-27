// 練習問題15-1
// 1から100までの整数をカンマで連結した文字列sを生成するコードを作成。
// また、完成した文字列sをカンマで分割し、String配列aに格納。
public class Exercise15_1 {
	static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
	}
}
