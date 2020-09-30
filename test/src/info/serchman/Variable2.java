package info.serchman;

//23.変数の扱い
public class Variable2 {
	public static void main(String args[]) {
		// String型(文字列)の変数を宣言
		String x;

		// String型の変数を宣言し、文字列を代入→省略可能！
		String x1 = "おはよう";
		String x2 = "ございます";

		//変数xにx1とx2を合わせたものを代入
		x = x1 + x2;

		System.out.println(x);
		// System.out.println(x1 + x2); でも同様
	}
}
