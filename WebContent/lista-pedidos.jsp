<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.agustinho.gerenciador.Pedido" %>
<% List<Pedido> lista = (List<Pedido>)request.getAttribute("pedidos"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<% for(Pedido pedido : lista) { %>
		<li> <%=pedido.getProduto() %> </li>
		<% } %>
	</ul>
</body>
</html>