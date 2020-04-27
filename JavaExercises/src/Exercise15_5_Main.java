import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 練習問題15-5
// 練習問題15-4と同様の動作を行うプログラムをTime APIを使って作成。
public class Exercise15_5_Main {
	public static void main(String[] args) {
		LocalDate nowTime = LocalDate.now();
		LocalDate future = nowTime.plusDays(100);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年mm月dd日");
		System.out.println(future.format(f));
	}
}
