import java.util.ArrayList;
import java.util.List;

// 練習問題16-2
// 2人の勇者（斎藤、鈴木）をHeroとしてインスタンス化してArrayListに格納し、1人ずつ順番に取り出して名前を表示するプログラムを作成。
public class Exercise16_2_Main {
	public static void main(String[] args) {
		Exercise16_2_Hero h1 = new Exercise16_2_Hero("斎藤");
		Exercise16_2_Hero h2 = new Exercise16_2_Hero("鈴木");
		List<Exercise16_2_Hero> heros = new ArrayList<Exercise16_2_Hero>();
		heros.add(h1);
		heros.add(h2);
		for(Exercise16_2_Hero h : heros) {
			System.out.println(h.getName());
		}
	}

}
