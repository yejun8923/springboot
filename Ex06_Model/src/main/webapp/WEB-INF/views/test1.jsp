<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("model : Hello World");
%>
<br>
당신의 이름은 ${name1} 입니다.
<br>
당신의 이름은 ${name2} 입니다.
</body>
</html>