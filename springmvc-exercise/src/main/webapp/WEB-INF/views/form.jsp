<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>フォーム</title>
</head>
<body>
	<h2>${message}</h2>
	<form:form modelAttribute="testForm">
		<form:errors path="multiError" />
		<br>
            ID:<form:input path="id" />
		<form:errors path="id" />
		<br>
            名前:<form:input path="name" />
		<form:errors path="name" />
		<br>
		<input type="submit">
	</form:form>
</body>
</html>