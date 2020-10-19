<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
	<title></title>
</head>
<body>
<br>

<%
	String message = (String)request.getAttribute( "login" );
	String name = (String)session.getAttribute( "name" );
	if(name == null) {
		message = "ログアウトされています。";
	}
%>

<br><br>
 <%= message %> <br><br>

こんにちは　<%= name %> さん<br><br>

<a href="/jsp_servlet/name.jsp">次のページに行く</a>


</body>
</html>
