<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, 
    br.com.caelum.agenda.dao.*,
    br.com.caelum.agenda.modelo.*,
    java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
		</tr>
		<%
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();
			
			for(Contato contato: contatos){
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<%SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); %>
			<td><%=sdf.format(contato.getDataNascimento().getTime())%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>