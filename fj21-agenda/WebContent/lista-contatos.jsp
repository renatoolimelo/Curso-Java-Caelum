<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"></c:import>
		<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />
		<table>
			<style type="text/css">
				tr:nth-child(even) {background: #CCC}
				tr:nth-child(odd) {background: #FFF}
			</style>
			<tr>
				<td>Nome</td>
				<td>E-mail</td>
				<td>Endereço</td>
				<td>Data de Nascimento</td>
			</tr>
			<c:forEach var="contato" items="${dao.lista}">
				<tr>
					<td>${contato.nome}</td>
					<td><c:if test="${not empty contato.email}"></c:if> <a
						href="mailto:${contato.email}">${contato.email}</a> <c:if
							test="${empty contato.email}">
								E-mail não informado
							</c:if></td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}"
							pattern="dd/MM/yyyy" /></td>
				</tr>
			</c:forEach>
		</table>
		<c:import url="rodape.jsp"></c:import>
	</body>
</html>