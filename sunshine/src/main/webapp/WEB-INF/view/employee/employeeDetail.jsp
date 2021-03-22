<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!-- jsp들어오면 include먼저 시켜준다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 리스트</title>
</head>
<body>
<table border="1">
<tr><td>직원번호</td><td>직원명</td><td>직원ID</td><td>직원연락처</td>
	  <td>직원Email</td><td>직원주소</td></tr>
	<tr>
		<td>${emNo.emNo}</td>
		<td>${emNo.emName }</td>
		<td>${emNo.emId }</td>
		<td>${emNo.emPhone }</td>
		<td>${emNo.emEmail }</td>
		<td>${emNo.emAddr }</td>
	</tr>
	<tr><td colspan="6">
		<input type="button" value="수정" onclick="javascript:location.href='employeeModify?emNo=${emNo.emNo }'" />
		<input type="button" value="삭제" onclick="javascript:location.href='employeeDelete?emNo=${emNo.emNo }'" />
	</td></tr>
</table>
</body>
</html>