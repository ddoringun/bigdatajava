<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ajax</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
					url:"xml/rank.xml",
					dataType:"xml",
					success: function(result){
						alert("xml문서 연결 성공");
						
					}
				});
			})
		</script>
	</head>
	<body>
		
	</body>
</html>