import java.lang.reflect.Method;

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
public class Exercise2_7_1_Launcher {
	public static void main(String[] args) {
		String fqcn = args[0];
		String sw = args[1];
		showMemory();
		try {
			Class<?> clazz = Class.forName(fqcn);
			listMethods(clazz);
			if(sw.contentEquals("E")) {
				launchExternal(clazz);
			}else if(sw.contentEquals("I")) {
				launchInternal(clazz);
			}else {
				throw new IllegalArgumentException("起動方法の指定が不適切です");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		showMemory();
		System.exit(0);
	}

	public static void listMethods(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示します");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}

	public static void launchExternal(Class<?> clazz) throws Exception{
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process proc = pb.start();
		proc.waitFor();
	}

	public static void launchInternal(Class<?> clazz) throws Exception {
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null, (Object)args);
	}

	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total =  Runtime.getRuntime().totalMemory();
		long usage = (total - free) / 1024 /1024;
		System.out.println("現在のメモリ使用量：" + usage + "MB");
	}
}
