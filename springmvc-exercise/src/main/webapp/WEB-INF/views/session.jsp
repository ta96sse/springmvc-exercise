<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>セッション</title>
</head>
<body>
	<h1>セッション管理</h1>
	HttpSession:
	<c:out value="${sessionScope.session1}" />
	<br> WebRequest:
	<c:out value="${sessionScope.session2}" />
	<br>
	<a href="/session/active">セッションをクリアせず再表示</a>
	<br>
	<a href="/session/clear">セッションをクリアして再表示</a>
</body>
</html>