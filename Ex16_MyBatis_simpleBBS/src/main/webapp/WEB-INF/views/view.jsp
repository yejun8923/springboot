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
 	<h3>내용보기</h3>
 	<hr>
 	<p>
 		작성자 : ${dto.writer}<br>
 		제목 : ${dto.title}<br>
 		내용 : ${dto.content}
 	</p>
 	<hr>
 	<p>
 		<input type="button" value="수정" onclick="location.href='updateForm?id=${dto.id}'">&nbsp;
 		<a href="list">목록보기</a>
 	</p>
</body>
</html>