<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>

	<%
		request.setCharacterEncoding("Windows-31J");
		String id = (String) request.getParameter("id");
		String pass = (String) request.getParameter("pass");
	%>

	�Q��ڂ̈��p��
	<br>
	<br> �h�c:<%=id%><br>
	<br> �p�X���[�h:<%=pass%><br>
	<br>

	<a href="index.jsp">�ŏ��ɖ߂�</a>

</body>
</html>
