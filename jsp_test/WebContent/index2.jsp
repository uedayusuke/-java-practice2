<!-- �ȉ���jsp��錾 -->
<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>

	<!-- "request"��JSP�Ő錾�Ȃ��Ŏg����"�ÖكI�u�W�F�N�g" -->
	<%
		request.setCharacterEncoding("Windows-31J");
		String id = (String) request.getParameter("id");
		String pass = (String) request.getParameter("pass");
	%>

	�h�c:<%=id%><br><br>
	 �p�X���[�h:<%=pass%><br><br>

	<!-- �ȉ��Ńf�[�^�������n�� -->
	<form action="index3.jsp" method="POST">
		<!-- "hidden"�ŉB���Ď����Ă����� -->
		<input type="hidden" name="id" value="<%=id%>">
		<input type="hidden" name="pass" value="<%=pass%>">
		<input type="submit" value="���̃y�[�W��">
	</form>
	<br>

	<a href="index.jsp">�߂�</a>

</body>
</html>
