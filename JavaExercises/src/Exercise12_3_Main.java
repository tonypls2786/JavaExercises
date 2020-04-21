// 練習問題12-3
// 練習問題12-2で用いたAクラスやBクラスのインスタンスをそれぞれ1つずつ生み出し、要素数2からなる単一の配列に格納する。
// 格納した後には配列の中身をループで順に取り出し、それぞれのインスタンスのb()を呼ぶ必要がある。
// 以上の前提に基づいて、次の問いに答える。
// ①配列変数の型としては何を用いるべきか。（解答は「練習問題解答xlsx」に記載）
// ②問題文に記述された内容のプログラムを作成。（解答を以下に記述）
public class Exercise12_3_Main {
	public static void main(String[] args) {
		Exercise12_2_Y[] array = new Exercise12_2_Y[2];
		array[0] = new Exercise12_2_A();
		array[1] = new Exercise12_2_B();
		for(Exercise12_2_Y y : array) {
			y.b();
		}
	}

}
