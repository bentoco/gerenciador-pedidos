<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pedidos</title>
</head>
<body>
	<h3>Cadastrar pedido</h3>
	<form action="/gerenciador-padaria/novo-pedido" method="post">
		<div>
			<label for="nome-produto">Nome produto:</label>
			<input type="text" id="nome-produto" name="produto">
			<button type=submit>Enviar</button>
		</div>
	</form>
</body>
</html>