// packageはフォルダ・ディレクトリ管理
package info.serchman;

// セクション3:Eclipseを試してみよう

// プログラム名称の宣言「class + 名称」
// 名称→単語ごとに大文字で区分ける
public class HelloWorld {
	// public→誰でも使える
	// static→オブジェクトを作らなくても使える
	// void→戻り値なし
	// main→メソッド、プログラムを実行する管理、一番最初に実行される！
	public static void main(String args[]) {
		// 変数xはint型(整数)であると宣言
		int x;
		// 変数xに26を代入
		x = 26;
		// 変数xを出力
		System.out.println(x);

		// 変数yはString型(文字列)であると宣言
		String y;
		// yに"おはよう"を代入
		y = "おはよう";
		// 変数yを出力
		System.out.println(y);

		// 命令文のお尻には";"
		// System.out.println("")→文字の出力
		System.out.println("HelloWorld");
	}
}
