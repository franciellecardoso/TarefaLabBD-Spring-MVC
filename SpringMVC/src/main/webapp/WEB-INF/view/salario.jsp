<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href='<c:url value="./resources/css/styles.css"/>'>
<meta charset="ISO-8859-1">
<title>Salario</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp" />
	</div>
	<div align="center">
		<form action="salario" method="get"></form>
		<br /> <br />
	</div>
	<div align="center">
		<c:if test="${not empty erro }">
			<H2>
				<c:out value="${erro }" />
			</H2>
		</c:if>
		<c:if test="${not empty saida }">
			<H2>
				<c:out value="${saida }" />
			</H2>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty salarios }">
			<table border="1" class="table_round">
				<thead>
					<tr>
						<th>Salario Funcionario</th>
						<th>Salario Dependente</th>
						<th>Salario Total</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${salarios }" var="s">
						<tr align="center">
							<td><c:out value="${s.salario_funcionario }"></c:out></td>
							<td><c:out value="${s.salario_dependente }"></c:out></td>
							<td><c:out value="${s.soma }"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>