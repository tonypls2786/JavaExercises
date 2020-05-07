// 練習問題5-2
// 練習問題5-1で作成したStrongBoxクラスにかぎの種類を示す列挙型KeyTypeを定義したうえで、以下の2つをStrongBoxクラスの定義に追加。
// ・鍵の種類を示すフィールド
// ・鍵の種類を受け取るコンストラクタ
// ただし、鍵の種類は以下の4種類に限定されるものとする。
// ①南京錠（PADLOCK）	必要試行回数＝1024回
// ②押ボタン（BUTTON）	必要試行回数＝10000回
// ③ダイヤル（DIAL）			必要試行回数＝30000回
// ④指紋認証（FINGER）	必要試行回数＝100000回
// なお、金庫はget()メソッドが呼び出されるたびに回数をカウントし、各鍵が定める必要試行回数に到達しない限りnullを返すようにする。
enum KeyType{PADLOCK, BUTTON, DIAL, FINGER;}

public class Exercise2_5_2_StrongBox<E> {
	private KeyType KeyType;
	private E item;
	private long count;
	public Exercise2_5_2_StrongBox(KeyType key) {
		this.KeyType = key;
	}
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		this.count++;
		switch(this.KeyType) {
		case PADLOCK:
			if(this.count < 1024) { return null; }
			break;
		case BUTTON:
			if(this.count < 1024) { return null; }
			break;
		case DIAL:
			if(this.count < 1024) { return null; }
			break;
		case FINGER:
			if(this.count < 1024) { return null; }
			break;
		}
		this.count = 0;
		return this.item;
	}
}
