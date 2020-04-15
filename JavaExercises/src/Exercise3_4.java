
public class Exercise3_4 {
	// 練習問題3-4
	// 処理を追加(false時の処理を追加)した際に意図した動きにならなかった。
	// 誤りがある部分とどのような現象が起きているか、どのように修正するのかを記述してください。
	// 以下、回答
	// 追加前は「else」以降が1行のみの記述だったため、「{}」が必要なかったが、処理を追加したためコンパイルエラーとなる。
	// よって、修正は「else」の後ろに「{」、追加分の後ろに「}」を追加する。
	public static void main(String[] args) {
		boolean tenki = false;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else
// 修正 start
		{
// 修正 end
			System.out.println("DVDを見ます");
// 問題文での追加部分 start
			System.out.println("寝ます");
// 問題文での追加部分 end
// 修正 start
		}
// 修正 end
	}
}
