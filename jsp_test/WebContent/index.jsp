<!-- PAGE�f�B���N�e�B�u�Ƃ����錾�� jsp��錾�I -->
<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<body>
	<%-- java�v���O������"<% %>"�ň͂� --%>
	<%
		String mongon = "�h�c�ƃp�X���[�h����͂��Ă��������B";
	%>

	<%-- �ϐ���<%= %>�ň͂� --%>
	<%=mongon%><br>
	<br>

	<form action="index2.jsp" method="POST">
		�h�c: <input type="text" name="id"> �p�X���[�h: <input type="text" name="pass">
		<br><br>
		 <input type="submit" value="submit">
	</form>

</body>
</html>