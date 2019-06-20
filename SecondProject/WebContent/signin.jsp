<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<link rel="stylesheet" type="text/css" href="log.css">
		<script type="text/javascript">
			$(function(){
				$("#idbtn").click(function(){
					var check = $(this).serialize();
					$.ajax({
						url:"MemberDAO.java",
						data: check,
						success: function(){
						}
					});
					return false;
					
				});
				
			});
		</script>
	</head>
	<body>
		<center>
			<h1>회원가입</h1>
			<hr color="pink" size="5">
			<form action="SignIn.jsp">
				<table border="0" class="sign1">
					<tr>
						<td class="sign1">아이디</td>
						<td class="sign2">
							<input type="text" name="id" maxlength="50">
							<input type="button" id="idbtn" value="중복확인" onClick="openIdChk()">
						</td>
					</tr>
					<tr>
						<td >비밀번호</td>
						<td><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="name" placeholder="이름을 입력하세요."></td>
					</tr>
					<tr>
						<td>성별</td>
						<td>
							<input type="radio" name="gender" value="female" checked>여자
							<input type="radio" name="gender" value="male" >남자
						</td>
					</tr>
					<tr>
						<td>생년월일</td>
						<td>
							<input type="text" name="birthY" maxlength="4" placeholder="년(4자)" size="6">
							<select name="birthM" >
								<option value="">월</option>
								<option value="01">1월</option>
								<option value="02">2월</option>
								<option value="03">3월</option>
								<option value="04">4월</option>
								<option value="05">5월</option>
								<option value="06">6월</option>
								<option value="07">7월</option>
								<option value="08">8월</option>
								<option value="09">9월</option>
								<option value="10">10월</option>
								<option value="11">11월</option>
								<option value="12">12월</option>
							</select>
							<input type="text" name="birthD" maxlength="2" placeholder="일" size="4">
						</td>
					</tr>
					<tr>
						<td>이메일</td>
						<td>
							<input type="text" name="emali" maxlength="50">&nbsp;@
							<select name="Eadd">
								<option>이메일 선택</option>
								<option>naver.com</option>
								<option>daum.net</option>
								<option>gmail.com</option>
								<option> hotmail.com</option>
								<option>yahoo.com</option>
							</select>
						</td>
					</tr>
				</table>
				<input type="submit" value="회원정보 등록">
			</center>
		</form>
	</body>
</html>