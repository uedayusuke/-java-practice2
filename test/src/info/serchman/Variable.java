package info.serchman;

// 23.変数の扱い
public class Variable {
	public static void main(String args[]) {
		// int型(整数)の変数を宣言
		int x;

		// int型(整数)の変数に値を代入→省略できる！！
		int x1 = 10;
		int x2 = 5;

		// x1とx2の合計をxに代入
		x = x1 + x2;
		System.out.println(x);
		x = x1 / x2;
		System.out.println(x);
	}

}
