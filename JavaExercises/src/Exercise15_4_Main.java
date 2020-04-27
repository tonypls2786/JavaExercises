import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 練習問15-4
// mainメソッドのみを持つMainクラスを定義し、以下の手順を参考にして「現在の100日後の日付」を「西暦2020年09月24日」という形式で表示するプログラムを作成。
// ①現在の日時をDate型で取得。
// ②取得した日時情報をCalendarにセット。
// ③Calendarから「日」の数値を取得。
// ④取得した値に100を足した値をCalenderの「日」にセット。
// ⑤Calendarの日時情報をDate型に変換。
// ⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示。
public class Exercise15_4_Main {
	public static void main() {
		// ①
		Date nowTime = new Date();
		// ②
		Calendar c = Calendar.getInstance();
		c.setTime(nowTime);
		// ③
		int day = c.get(Calendar.DAY_OF_MONTH);
		// ④
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		// ⑤
		Date future = c.getTime();
		// ⑥
		SimpleDateFormat f = new SimpleDateFormat("西暦yyy年mm月dd日");
		System.out.println(f.format(future));
	}
}
