
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${cp}/resources/css/normal.css" />
<body>

<h1>item List</h1>

<!-- commandName = controller의 parameter -->
<form:form action="${cp}/addItem" method="get" commandName="checkList">
		아이템 입력
	 <form:input path="itemTitle" />
		<br><br>
		<input type="submit" value="add" >
	</form:form>



</body>
</html>