package info.serchman;

//23.変数の扱い
public class Variable2 {
	public static void main(String args[]) {
		// String型(文字列)の変数を宣言
		String x;

		// String型の変数を宣言し、文字列を代入→省略可能！
		String x1 = "10";
		int y1;
		y1 = Integer.parseInt(x1);
		String x2 = "5";
		int y2;
		y2 = Integer.parseInt(x2);

		//変数xにx1とx2を合わせたものを代入
		x = x1 + x2;

		System.out.println(x);
		System.out.println(y1 + y2);
	}
}
