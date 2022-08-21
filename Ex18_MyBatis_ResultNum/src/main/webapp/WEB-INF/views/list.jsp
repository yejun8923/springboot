<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table width="500" cellpadding="0" cellspacing="0" border="1">
 	<tr>
 		<th>번호</th>
 		<th>작성자</th>
 		<th>제목</th>
 		<th>삭제</th>
 	</tr>
 	<c:forEach var="dto" items="${list}">
 		<tr>
 			<td>${dto.id}</td>
 			<td>${dto.writer}</td>
 			<td><a href="view?id=${dto.id}">${dto.title}</a></td>
 			<td><a href="delete?id=${dto.id}">X</a></td>
 		</tr>	
 	</c:forEach>
 </table>
 
 <p><a href="writeForm">글작성</a></p>
</body>
</html>