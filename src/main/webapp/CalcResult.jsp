<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 문서</title>
</head>
<body>
	<h1>요청 처리 결과값 : <%= session.getAttribute("resultData") %> 입니다.</h1>
	<h1>요청 처리 결과값 : ${resultData} 입니다.</h1>
</body>
</html>