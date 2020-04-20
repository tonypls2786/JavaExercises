// 練習問題9-1
// 「Thief」クラスについて、以下の条件を満たすコンストラクタを定義
// このクラスは、「new Thief("アサカ", 40, 5)」のように名前・HP・MPを指定してインスタンス化することができる。
// このクラスは、「new Thief(”アサカ”, 35)」のように、名前とHPだけを指定してインスタンス化することもできる。この場合、MPは5で初期化される。
// このクラスは、「new Thief("アサカ")」のように名前だけを指定してインスタンス化することもできる。この場合、HPは40、MPは5で初期化される。
// このクラスは、「new Thief()」のように名前を指定しない場合にはインスタンス化できないものとする。
// コンストラクタは極力重複コードをなくすように記述する。
public class Exercise9_1_Thief {
	String name;
	int hp;
	int mp;

// 以下、解答
	public Exercise9_1_Thief(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Exercise9_1_Thief(String name, int hp) {
		this(name, hp, 5);
	}

	public Exercise9_1_Thief(String name) {
		this(name, 40);
	}
}
