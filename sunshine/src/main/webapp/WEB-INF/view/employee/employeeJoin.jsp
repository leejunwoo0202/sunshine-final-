<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="employeeJoinOk" method="post" name="frm">
<table border="1">
	<tr><td>직원명</td>
		<td><input type="text" name="emName"/></td></tr>
	<tr><td>직원ID</td>
		<td><input type="text" name="emId" /></td></tr>
	<tr><td>직원PW</td>
		<td><input type="text" name="emPw"/></td></tr>
	<tr><td>직원연락처</td>
		<td><input type="text" name="emPhone"/></td></tr>
	<tr><td>직원Email</td>
		<td><input type="text" name="emEmail"/></td></tr>
	<tr><td>직원 주소</td>
		<td><input type="text" name="emAddr"/></td></tr>
		<tr><td colspan="2">
		<input type="submit" value="등록" />
		<input type="reset" value="초기화" />
		</td></tr>
</table>
</form>
</body>
</html>