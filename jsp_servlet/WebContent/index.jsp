<%@ page language="java" contentType="text/html;charset=Windows-31J" %>

<html>
<head>
	<title></title>
</head>
<body>

<%
	String mongon = "�h�c�ƃp�X���[�h����͂��Ă��������B";
%>



<%= mongon %><br>
<br>

<form action="/jsp_servlet/Login" method="POST">
	�h�c: <input type="text" name="id">		�p�X���[�h: <input type="text" name="pass">
	<br><br>

	<input type="submit" value="submit">
</form>

</body>
</html>