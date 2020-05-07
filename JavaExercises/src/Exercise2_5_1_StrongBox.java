// 練習問題5-1
// 以下の仕様に従った金庫をStrongBoxクラスとして定義してください。
// ・金庫クラスに格納するインスタンスの型は、開発時には未定。
// ・金庫には、1つのインスタンスを保存できる必要がある。
// ・put()でインスタンスを保存し、get()でインスタンスを取得できる。
// ・get()で取得する際、キャストを使わなくても格納前の型に代入できる。
public class Exercise2_5_1_StrongBox<E> {
	private E item;
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		return this.item;
	}
}
