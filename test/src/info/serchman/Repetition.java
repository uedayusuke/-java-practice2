package info.serchman;

// 26.繰り返し処理
public class Repetition {
	public static void main(String args[]) {

		// int型(整数)の変数sumを宣言し、0を代入
		int sum = 0;

		/*
		 for (初期化, 継続条件, 増減式){処理}
		*/
		/*
		 省略形
		 i = i + 1 → i++
		 sum = sum + 1 → sum += i
		 */
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + ":途中合計：" + sum);
		}
		System.out.println("合計：" + sum);

		int sum2 = 0;
		int z; //zをforの外で定義する → ループの外側で使用する為
		for (z = 1; z <= 10; z++) {
			sum2 += z;
			if (sum2 > 30)
				break; // breakでループを抜ける
		}
		System.out.println("30を超えたのは？：" + z);
	}

}
