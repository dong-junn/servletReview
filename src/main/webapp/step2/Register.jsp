<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>MVC 모델-회원가입</title>

</head>
<body>

<%@ include file="Top.jsp" %>

<h1 style="margin-top:100px"> 회원 가입 </h1>

<form name="regForm" method="get" action="register.do">
	아이디 : <input type="text" name="id" size="15">
	       <input type="button" value="ID중복확인" onClick="idCheck(this.form.mem_id.value)"> <br>
	
	패스워드 : <input type="password" name="password" size="15"> <br>
	이름 : <input type="text" name="name" size="15">  <br>
	역할 : <select name=role>
			<option value="0">선택하세요.
			<option value="관리자">관리자
			<option value="일반">일반
			</select>  <br>
	<input type="submit" value="회원가입" > 		 
	<input type="reset" value="다시쓰기"> 

</form>

		
	</td>
	</tr>
	</table>



		

	
</body>
</html>