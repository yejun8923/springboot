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
	out.println("#03 : Hello World");
%>
<br>
당신의 ID은 ${member.id} 입니다.
<br>
당신의 이름은 ${member.name} 입니다.
</body>
</html>