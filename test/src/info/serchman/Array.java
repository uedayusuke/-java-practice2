package info.serchman;

// 27.配列
public class Array {
	public static void main(String args[]) {
		/*
		 配列の宣言
		 型 変数名[] = new 型[x]
		 (xは表の行数)
		 */
		String name[] = new String[3];
		double height[] = new double[3];

		// 下記で値を代入
		name[0] = "上田";
		name[1] = "藤江";
		name[2] = "吉岡";
		height[0] = 165.0;
		height[1] = 158.9;
		height[2] = 168.4;

		// forで繰り返し
		// ブレークポイントを設定し、デバックを行う
		for (int i = 0; i <= 2; i++) {
			System.out.println(name[i] + ":" + height[i] + "cm");
		}
	}
}
