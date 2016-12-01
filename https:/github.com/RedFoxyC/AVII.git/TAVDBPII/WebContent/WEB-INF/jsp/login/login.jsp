<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<script type="text/javascript" src='${pageContext.request.contextPath}/JS/jquery-3.1.1.js'></script>
	<script type="text/javascript" src='${pageContext.request.contextPath}/JS/scripts.js'></script>
	<script src="formzin.min.js" type="text/javascript"></script>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="">
</head>
<body>
	<header></header>
	<div id="container">
		<form>
		<input type="text" name="login" placeholder="Login"/>
		<input type="password" name="senha" placeholder="senha"/>
		<a href="cadastro.html">cadastre-se</a>
		<input type="submit" value="Entrar">
		</form>
	</div>
</body>
</html>