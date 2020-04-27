// 練習問題15-2
// フォルダ名が入っている変数folderと、ファイル名が入っている変数fileがある。
// fileは必ず「readme.txt」のような形式をしているが、folderは末尾に¥記号がついている場合とついていない場合の療養がある。
// folderとfileを連結して、「c:¥javadev¥readme.txt」のような完全なファイル名としての文字列を完成させるメソッドを作成。
public class Exercise15_2 {
	public String concatePath(String folder, String file) {
		if(!folder.endsWith("¥¥")) {
			folder += "¥";
		}
		return folder + file;
	}

}
