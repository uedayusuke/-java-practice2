<!-- 以下でjspを宣言 -->
<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>

	<!-- "request"はJSPで宣言なしで使える"暗黙オブジェクト" -->
	<%
		request.setCharacterEncoding("Windows-31J");
		String id = (String) request.getParameter("id");
		String pass = (String) request.getParameter("pass");
	%>

	ＩＤ:<%=id%><br><br>
	 パスワード:<%=pass%><br><br>

	<!-- 以下でデータを引き渡す -->
	<form action="index3.jsp" method="POST">
		<!-- "hidden"で隠して持っていける -->
		<input type="hidden" name="id" value="<%=id%>">
		<input type="hidden" name="pass" value="<%=pass%>">
		<input type="submit" value="次のページへ">
	</form>
	<br>

	<a href="index.jsp">戻る</a>

</body>
</html>
