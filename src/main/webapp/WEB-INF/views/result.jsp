<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Result : <%=request.getAttribute("word") %><br>
	<form action="/springmvc/">
		<input type="submit" value="back">
	</form>
</body>
</html>