<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String conPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>createPage.jsp</h3>
	
	<form action="<%=conPath%>/create">
		<p>
		 	작성자 : <input type="text" name="writer" value="${dto.writer}"> <br>
		 	내용 : <input type="text" name="content" value="${dto.content}">
		</p>
		<p>
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>