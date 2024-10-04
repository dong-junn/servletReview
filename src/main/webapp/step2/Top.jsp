<%@ page contentType="text/html;charset=UTF-8" %>
<%
	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=Login.jsp> 로그인 </a>";
	else log = "<a href=logout.do> 로그아웃 </a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 회원 등록 </a>";
	else mem = "<a href=#> 회원 수정 </a>";
%>

<%=log%> /
<%=mem%> /
장바구니 /
커뮤니티

<hr>