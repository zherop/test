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
	<c:choose>
		<c:when test="${user!=null}">
			<h3>${user.name}</h3>
			<p>${user.age}</p>
			<p>${user.desc}</p>
			<p>${user.headPicture}</p>
		</c:when>
		<c:otherwise>
			没有找到该用户信息。
		</c:otherwise>
	</c:choose>
</body>
</html>