import java.io.FileInputStream;
import java.io.FileOutputStream;

// 練習問題9-1
// FileInputStreamクラスとFileOutputStreamクラスを使って、ファイルをコピーするプログラムを作成。
// コピー元ファイル名とコピー先ファイル名はJavaプログラムの起動パラメータとして指定するものとし、バッファリングやエラー処理、例外処理は不要とする。
public class Exercise2_9_1 {
	public static void main(String[] args) throws Exception{
		String inFile = args[0];
		String outFile = args[1];
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		int i = fis.read();
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();
	}

}
