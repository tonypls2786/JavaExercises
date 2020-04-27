import java.io.IOException;

// 練習問題17-4
// 起動直後にIOExceptionを送出して以上終了するようなプログラムを作成。
public class Exercise17_4 {
	public static void main(String[] args) {
		throw new IOException();
	}

}
