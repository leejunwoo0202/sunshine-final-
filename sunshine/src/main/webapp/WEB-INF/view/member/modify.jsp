<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   isELIgnored="false"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
</head>
<body>
<table border="1">
<form:form action="memberModifyPro" name="frm" method="post" id="frm"  
modelAttribute="loginCommand">
 <tr><td>비밀번호확인<input type="password" name="loginPw" ></td></tr>
 <tr><td><input type="submit" value="전송"></td></tr>
 
      
</form:form>
</table>
</body>
</html>