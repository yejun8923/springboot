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
 	<form action="update" method="post">
 		<input type="hidden" name="id" size="50" value="${dto.id}">
 		<tr>
 			<td>작성자</td>
 			<td>
 				<input type="text" name="writer" size="50" value="${dto.writer}">
 			</td>
 		</tr>
 		<tr>
 			<td>제목</td>
 			<td>
 				<input type="text" name="title" size="50" value="${dto.title}">
 			</td>
 		</tr>
 		<tr>
 			<td>내용</td>
 			<td>
 				<input type="text" name="content" size="50" value="${dto.content}">
 			</td>
 		</tr>
 		<tr>
 			<td colspan="2">
 				<input type="submit" value="수정"> &nbsp;&nbsp;
 				<a href="list">목록보기</a>
 			</td>
 		</tr>
 	</form>
 </table>
</body>
</html>