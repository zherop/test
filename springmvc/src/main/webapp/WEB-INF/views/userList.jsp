<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User list</title>
</head>
<body>
	<a href="register">添加</a>
	<ul>
		<c:forEach var="user" items="${users}">
			<li><h2><a href="user/${user.name}">${user.name}</a></h2></li>
		</c:forEach>
	</ul>
</body>
</html>