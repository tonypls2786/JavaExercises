
public class Exercise4_3 {
	// 練習問題4-3
	// 9行目、10行目で例外が発生する。
	// それぞれの行で発生する例外の名前を答える。
	// 以下、回答
	// 12行目:NullPointerException
	// 13行目:ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		System.out.println(counts[1]);
		System.out.println(heights[2]);
	}

}
