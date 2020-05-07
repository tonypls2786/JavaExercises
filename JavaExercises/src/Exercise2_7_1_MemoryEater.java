// 練習問題7-1
// 次のような動作をするクラスLauncherを作成。（例外処理は省略可）
// ①コマンドライン引数から、次の2つの情報を受け取る。
// ・第一引数・・・起動すべきクラスのFQCN
// ・第二引数・・・起動仕方を示す文字。EまたはI
// ②現在のメモリ使用量を表示する。
// ③FQCNのクラスが持つ、すべてのメソッド名を表示する。
// ④コマンドライン第二引数によって次のように起動する。
// ・Eの場合・・・ProcessBuilderで別プロセスとして起動する。
// ・Iの場合・・・リフレクションでmainメソッドを呼び出す。
// ⑤現在のメモリ使用量（MB単位）を表示する。
// ⑥このプログラムが終了する際には、起動に成功した場合は０、そうでなければ１を終了コードとする。
// また、起動すると要素数1280000のlong型配列を確保するだけの処理を行うプログラムMemoryEaterを作成し、Launcherで2通りの起動を試す。
public class Exercise2_7_1_MemoryEater {
	public static void main(String[] args) {
		System.out.println("eating memory...");
		long[] larry = new long[1280000];
		for(int i = 0; i < larry.length; i++) {
			larry[i] = i;
		}
	}

}
