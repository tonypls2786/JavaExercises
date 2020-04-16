
public class Exercise5_4 {
	// 練習問題5-4
	// 以下の仕様を参考にメソッド「calcTriangleArea」「calcCircleArea」を定義。
	// また、定義したメソッドをmainメソッドから呼び出す。
	// mainメソッドからそれぞれのメソッドに適当な引数を渡して呼び出し、戻り値を出力して正しい面積が表示されるかを確認。
	// 以下、「calcTriangleArea」の仕様
	// メソッド名:calcTriangleArea
	// 戻り値の型:三角形の面積（double）
	// 引数リスト:三角形の底辺の長さ、単位はcm（double bottom）
	// 三角形の高さ、単位はcm（double height）
	// 処理内容:引数を使用して面積を求め、それを戻す。
	//
	// 以下、「calcCircleArea」の仕様
	// メソッド名:calcCircleArea
	// 戻り値の型:円の面積（double）
	// 引数リスト:円の半径、単位はcm（double radius）
	// 処理内容:引数を使用して面積を求め、それを戻す。
	public static void main(String[] args) {
		double triangleBottom = 10.0;
		double triangleHeight = 5.0;
		double circleRadius = 5.0;

		System.out.println("三角形の底辺の長さが" + triangleBottom + "cm、高さが" + triangleHeight + "の場合、面積は" + calcTriangleArea(triangleBottom, triangleHeight) + "㎠");
		System.out.println("円の半径が" + circleRadius + "cmの場合、面積は" + calcCircleArea(circleRadius) + "㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
