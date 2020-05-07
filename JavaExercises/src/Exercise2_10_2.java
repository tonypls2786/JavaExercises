import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 練習問題10-2
// 次のような「社員クラス」と「部署クラス」がある。
// class Employee{		// 社員クラス
// 	String name;
// 	int age;
// }
// class Department{	// 部署クラス
// 	String name;
// 	Employee leader;
// }
// 「総務部」のリーダー「田中太郎（41歳）」のインスタンスをJVM内に生成した上で、
// 直列化機構を使ってファイル「c\company.dat」に書き込むプログラムを作成。
// また、上記2クラスを必要な範囲で修正。
class Employee implements java.io.Serializable{
	String name;
	int age;
}
class Department implements java.io.Serializable{
	String name;
	Employee leader;
}
public class Exercise2_10_2 {
	public static void main(String[] args) throws Exception{
		Employee tanaka = new Employee();
		tanaka.name = "田中太郎";
		tanaka.age= 41;
		Department soumubu = new Department();
		soumubu.name = "総務部";
		soumubu.leader = tanaka;
		FileOutputStream fos = new FileOutputStream("c\\:company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(soumubu);
		oos.flush();
		oos.close();
	}

}
