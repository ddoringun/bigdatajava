<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="insert.do">
			아이디 : <input type="text" name="id"><br>
			패스워드 : <input type="password" name="pw"><br>
			이름 : <input type="text" name="name"><br>
			나이 : <input type="text" name="age"><br>
			<button type="submit">서버로 전송</button>
		</form>
		
	</body>
</html>