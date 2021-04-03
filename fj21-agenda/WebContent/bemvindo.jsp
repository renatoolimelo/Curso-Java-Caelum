<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%-- comentario em JSP aqui: nossa primeira página JSP --%>
	<%
	String mensagem = "Bem vindo ao sistema de agenda do FJ-21";
	%>
	<%
	out.println(mensagem);
	%>

	<br>

	<%
	String desenvolvido = "Desenvolvido por (Renato Melo)";
	%>
	<%=desenvolvido%>

	<br>

	<%
	System.out.println("Tudo foi executado");
	%>

</body>
</html>