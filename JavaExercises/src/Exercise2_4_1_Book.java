import java.util.Date;

// 練習問題4-1
// 以下の動作を実現するように次のような書籍クラス（Bookクラス）を改良する。
// ただし、各フィールドにnullが入っている場合は考慮しなくてよい。
// ①署名と発効日が同じであれば等価なものと判定され、かつ、HashSetなどに格納しても正しく利用できる。
// ②Bookインスタンスを格納したコレクションに対して。「Collections.sort()」を呼び出すと、発行日が古い順に並び変えられる。
// ③clone()を呼び出すと、深いコピーによる複製が行われる。
public class Exercise2_4_1_Book {
	private String title;
	private Date publishDate;
	private String comment;
	// getter/setterの宣言は省略
// 改良 start
	public int HashCode() {
		int r = 1;
		r = 31 * r + publishDate.hashCode();
		r = 31 * r + title.hashCode();
		return r;
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Exercise2_4_1_Book)) {
			return false;
		}
		Exercise2_4_1_Book b = (Exercise2_4_1_Book) o;
		if(! publishDate.equals(b.publishDate)) {
			return false;
		}
		if(! title.equals(b.title)) {
			return false;
		}
		return true;
	}
	public int compareTo(Exercise2_4_1_Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	public Exercise2_4_1_Book clone() {
		Exercise2_4_1_Book b = new Exercise2_4_1_Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date) this.publishDate.clone();
		return b;
	}
// 改良 end
}
