package info.searchman.lesson.jsp_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 変数の初期設定
		String name = "ゲスト"; // 名前の初期値設定
		String status = "ログイン失敗"; // ログインステータス

		// 文字コードの初期値設定
		request.setCharacterEncoding("UTF-8");

		// IDの取得
		String id = request.getParameter("id");

		// パスワードの取得
		String pass = request.getParameter("pass");

		// IDとパスワードのチェック
		if (id.equals("search") && pass.equals("man")) {
			status = "ログイン成功";
			name = "����";
		}

		// �T�[�u���b�g���g�ŕ\������
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body><br><br>");
		out.println(status + "<br><br>����ɂ��� " + name + " ����");
		out.println("</body>");
		out.println("</html>");

		// ���N�G�X�g�Ƀf�[�^��ǉ�����
		// request.setAttribute("login", status);
		// request.setAttribute("name", name);

		// HttpSession�̍쐬�ƃZ�b�V�����Ƀf�[�^��ǉ�����
		// HttpSession session = request.getSession( true );
		// session.setAttribute( "name", name );

		// result.jsp�֓]��
		// request.getRequestDispatcher("/result.jsp").forward(request, response);

	}
}
