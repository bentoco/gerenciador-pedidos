<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String produto = (String)request.getAttribute("produto");  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<p>Você cadastrou seu pedido com sucesso!</p>
		<p>Produto: <%=produto %></p>
		<a href="lista-pedidos">Listar pedidos</a>
</body>
</html>