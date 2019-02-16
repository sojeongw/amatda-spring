<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>MODIFY</h1>
	
	<form:form action="/amatda/modifyItem" method="post">
		<form:hidden path="itemTitle" value="${checkList.itemTitle}"/>
		<table>
			<tr>
				<td>item</td>
				<td>${checkList.itemTitle}</td>
			</tr>
		
			<tr>
				<td colspan="2"><input type="submit" value="Modify" ></td>
			</tr>
		</table>
	</form:form>
	
	<a href="${cp}/">MAIN</a>

</body>
</html>