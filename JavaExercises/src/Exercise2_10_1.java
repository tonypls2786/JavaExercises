import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

// 練習問題10-1
// 次のような内容のプロパティファイル「c:\pref.properties」があるとする。
// 以下ファイル内容
// tokyo.capital = 東京
// tokyo.food = 寿司
// aichi.capital = 名古屋
// aichi.food = 味噌カツ
// 以上ファイル内容
// このファイルの内容を読み込み、aichi.capitalとaichi.foodの内容を「名古屋：味噌カツ」の形式で画面に表示するプログラムを作成。
public class Exercise2_10_1 {
	public static void main(String[] args) throws Exception{
		Reader fr = new FileReader("c\\pref.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("aichi.catital") + ":" + p.getProperty("aichi.food"));
		fr.close();
	}
}
