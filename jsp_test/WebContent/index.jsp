<!-- PAGEディレクティブという宣言文 jspを宣言！ -->
<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<body>
	<%-- javaプログラムは"<% %>"で囲む --%>
	<%
		String mongon = "ＩＤとパスワードを入力してください。";
	%>

	<%-- 変数は<%= %>で囲む --%>
	<%=mongon%><br>
	<br>

	<!-- 以下でデータを引き渡す -->
	<form action="index2.jsp" method="POST">
		ＩＤ: <input type="text" name="id"> パスワード: <input type="text" name="pass">
		<br><br>
		 <input type="submit" value="submit">
	</form>

	<!-- JSPは、ブラウザからの最初のアクセスで、Javaプログラムに変換される。 -->

</body>
</html>