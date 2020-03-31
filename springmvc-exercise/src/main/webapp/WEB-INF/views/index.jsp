<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>はじめてのSpring MVC</title>
</head>
<body>
	<h1>Hello Spring MVC!!</h1>
	<form action="/" method="post">
		<input type="text" name="param1">
		<input type="submit" value="POST送信">
	</form>
	<div>
		<div>HttpServletRequest:${requestScope.req1}</div>
		<div>WebRequest:${requestScope.req2}</div>
		<div>Model:${requestScope.req3}</div>
	</div>
</body>
</html>