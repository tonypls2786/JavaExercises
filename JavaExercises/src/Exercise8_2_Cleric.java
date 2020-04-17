// 練習問題8-2
// 練習問題8-1のClericクラスに「名前」「HP」「最大HP」「MP」「最大MP」を属性として追加
// HPと最大HPは整数で初期値50、MPと最大MPは整数で初期値10であり、最大HPと最大MPは定数フィールドとして宣言
public class Exercise8_2_Cleric {
// 追加 start
	String name;
	final int MAXHP = 50;
	int hp = 50;
	final int MAXMP = 10;
	int mp = 10;
// 追加 end
}
