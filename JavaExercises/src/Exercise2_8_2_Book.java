import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

// 練習問題8-2
// 第4章の練習問題の条件①を以下のように修正した課題を実施。
// 旧：書名と発効日が同じであれば等価なものと判定
// 新：書名と発効日とコメントが同じであれば等価なものと判定
// その際、commons-langに含まれる以下のクラスを利用
// HashCodeBuilder/EqualsBuilder/CompareToBuilder
public class Exercise2_8_2_Book implements Comparable<Exercise2_8_2_Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	// getter/setterの宣言は省略
	public int HashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	public int compareTo(Exercise2_8_2_Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}
	public Exercise2_8_2_Book clone() {
		Exercise2_8_2_Book b = new Exercise2_8_2_Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date) this.publishDate.clone();
		return b;
	}
}
