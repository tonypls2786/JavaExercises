import java.util.HashMap;
import java.util.Map;

// 練習問題16-3
// 練習問題16-2の2人の勇者をインスタンス化し、それぞれの勇者が倒した敵の数(3,7)を勇者とペアでコレクションに格納。
// 次に、1人ずつ取り出して倒した数を画面表示。
public class Exercise16_3_Main {
	public static void main(String[] args) {
		Exercise16_2_Hero h1 = new Exercise16_2_Hero("斎藤");
		Exercise16_2_Hero h2 = new Exercise16_2_Hero("鈴木");
		Map<Exercise16_2_Hero, Integer> heros = new HashMap<Exercise16_2_Hero, Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		for(Exercise16_2_Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した相手＝" + value);
		}
	}

}
