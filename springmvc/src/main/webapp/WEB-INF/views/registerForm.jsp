<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User list</title>
</head>
<body>
	<div>
		<form action="register" method="post" enctype="multipart/form-data">
			name:<input type="text" name="name" /></br> 
			age:<input type="text" name="age" /></br> 
			desc:<input type="text" name="desc" /></br> 
			head:<input type="file" name="headPicture" accept="jpg,png"/></br> 
			<input type="submit" value="注册" />
		</form>
		<c:if test="${Errors!=null}">
			<c:forEach items="${Errors}" var="error">
				<p>${error.defaultMessage}</p>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>