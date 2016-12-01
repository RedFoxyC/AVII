<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		Nome:<br>
		<input type="text" name="nome" placeholder="Nome Completo"/><br>
		CPF:<br>		
		<input type="text" name="cpf" class="cpf"><br>
		Email:<br>
		<input type="text" name="email" class="validar-email" id="email" 
			data-msn_validacao="Por favor, preencha o e-mail corretamente." 
			placeholder="Informe o seu email" /><br>
		<input type="text" name="email-confirm" placeholder="confirme o seu email" id="email-conf"/><br>
		Telefone:<br>
		<input type="text" class="telefone" /><br>
		Sexo:<br>
		<input type="radio" name="sexo" value="Masculino" />Masculino
		<input type="radio" name="sexo" value="Feminino" />Feminino<br>
		Dados de usuário:
		Login:<br>
		<input type="text" name="loginC" placeholder="Escolha um nome de usuário"/><br>
		Senha:<br>
		<input type="password" name="senhaC" id="senha1" placeholder="Digite uma senha"><br>
		Atenção, sua senha deve conter no mínimo 8 caracteres!<br>
		<input type="password" name="senhaC" id="senha2" placeholder="Confirme sua senha"><br>
		<input type="submit">Finalizar<br>
		<a href="login.jsp">cancelar</a>
	</form>
</body>
</html>