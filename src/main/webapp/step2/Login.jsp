<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=Login.jsp> 로그인 </a>";
	else log = "<a href=/2022PolyB/logout.do> 로그아웃 </a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 회원 등록 </a>";
	else mem = "<a href=#> 회원 수정 </a>";
%>
<html>
<head>
<title>모델 2 예제 (로그인)</title>

</head>
<body >
<h1> MVC의 모델 2 </h1>

<%=log%> <%=mem%>
<br><br>
	
<form method="get" action="login.do">
	로그인 : <input type="text" name="id"> <br>
	Password : <input type="text" name="password"><br>
	<input type="submit" value="login">
	<input type="reset" value="reset">
</form>
		
</body>
</html>