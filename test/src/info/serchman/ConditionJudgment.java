package info.serchman;

// 25.条件判断
public class ConditionJudgment {
	public static void main(String args[]) {
		// int型(整数)の変数umareを宣言
		int umare;

		// 変数umareに代入
		umare = 1980;
		/*
		 条件判断の基本
		 if(条件){処理}
		 */
		if (umare < 1989) {
			System.out.println("昭和生まれです");
		}
		umare = 1990;
		if (umare >= 1989) {
			System.out.println("平成生まれです");
		}

		/*
		 else分
		 if(条件){処理}
		 else{処理}
		 */
		umare = 1968;
		if (umare < 1989) {
			System.out.println("昭和生まれです");
		} else {
			System.out.println("平成生まれです");
		}
	}
}
