// 練習問題14-1
// 口座番号を表すString型フィールドaccountNumberと、残高を表すint型フィールドbalanceを持つ銀行口座クラスを作成。
// さらに、このクラスにメソッド宣言を追加して次の①と②の条件を満たすように修正。
// ①口座番号4649、残高1592円のAccountインスタンスを変数aに生成し、「System.out.println(a);」を実行すると、
// 画面に「¥1592(口座番号=4649)」と表示される。
// ②口座番号等しければ等価と判断される。ただし、「 4649」など、口座番号の先頭に半角スペースがつけられた場合でも、
// それを無視して比較できる（「 4649」口座と「4649」口座は同じものと捉える）。
public class Exercise14_1_Account {
	String accountNumber;	// 口座番号
	int balance;			// 残高
	// ①
	public String toString() {
		return "¥¥" + balance + "(口座番号=" + accountNumber + ")";
	}
	// ②
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Exercise14_1_Account) {
			Exercise14_1_Account a = (Exercise14_1_Account) obj;
			String accNum1 = this.accountNumber.trim();
			String accNum2 = a.accountNumber.trim();
			if(accNum1.equals(accNum2)) {
				return true;
			}
		}
		return false;
	}
}
