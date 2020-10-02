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

		/*
		 elseif分
		 if(条件){処理}
		 elseif(条件){処理}
		 elseif(条件){処理}
		 else{処理}
		 */
		umare = 1980;
		if (umare < 1912) {
		System.out.println("明治生まれです");
		} else if (umare < 1927) {
		System.out.println("大正生まれです");
		} else if (umare < 1989) {
		System.out.println("昭和生まれです");
		} else {
		System.out.println("平成生まれです");
		}
	}
}
