<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호변경</title>
</head>
<body>
<form:form action="memberModifyPro2" method="post" name="frm"
        modelAttribute="memberPwCommand">
      현재 비밀번호 :<input type="password" name="oldPw" />
      <br/>
      바꿀 비밀번호 :<input type="password" name="newPw" />
      <br/>
      비밀번호 확인 :<input type="password" name="newPwCon"/>
      <br/>
      <input type="submit" value="변경"/>
</form:form>


</body>
</html>