import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

// 練習問題9-2
// 練習問題9-1で作ったプログラムを下記に従って改造し、ファイル圧縮ソフトを作成。
// ・ファイルを書き込む際、java.util.zip.GZIPOutputStreamを使って圧縮する。
// ・ファイルの書き込みには必ずバッファリングを行う。
// ・例外処理を正しく行う。
public class Exercise2_9_2 {
	public static void main(String[] args) {
		String inFile = args[0];
		String outFile = args[1];
// 改造 start
//		FileInputStream fis = new FileInputStream(inFile);
//		FileOutputStream fos = new FileOutputStream(outFile);
		FileInputStream fis = null;
		GZIPOutputStream gzos = null;
// 改造 end
// 改造 start
		try {
			fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
// 改造 end
			int i = fis.read();
			while(i != -1) {
// 改造 start
// 				fos.write(i);
				gzos.write(i);;
// 改造 end
				i = fis.read();
			}
// 改造 start
//		fos.flush();
//		fos.close();
			gzos.flush();
			gzos.close();
// 改造 end
			fis.close();
// 改造 start
		}catch(IOException e) {
			System.out.println("ファイル操作失敗");
			try {
				if(fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			}catch(IOException ee) {}
		}
// 改造 end
	}

}
