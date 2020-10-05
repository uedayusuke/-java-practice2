package info.serchman;

// 27.配列
public class Array {
	public static void main(String args[]) {
		/*
		 型 変数名[] = new 型[x]
		 (xは表の行数)
		 */
		String name[] = new String[3];
		double height[] = new double[3];
		name[0] = "山田";
		name[1] = "田中";
		name[2] = "鈴木";
		height[0] = 170.2;
		height[1] = 183.2;
		height[2] = 175.7;
		for (int i = 0; i <= 2; i++) {
			System.out.println(name[i] + ":" + height[i] + "cm");
		}
	}
}
