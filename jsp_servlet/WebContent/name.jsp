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
%>

<br><br>
 <%= message %> <br><br>

こんにちは　<%= name %> さん<br><br>

<a href="/jsp_servlet/result.jsp">前のページに戻る</a>
<br><br><br><br>
<a href="/jsp_servlet/logout.jsp">ログアウト</a>
<br><br><br><br>


</body>
</html>