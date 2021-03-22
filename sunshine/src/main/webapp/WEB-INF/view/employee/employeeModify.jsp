<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!-- jsp들어오면 include먼저 시켜준다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원수정 페이지</title>
</head>
<body>
<form action="employeeModifyOk" method="post" name="frm" >
<input type="hidden" name="emNo" value="${emNo.emNo }" />
<table border="1">

<tr><td>직원번호</td><td>직원명</td><td>직원ID</td><td>직원연락처</td>
	  <td>직원Email</td><td>직원주소</td></tr>
	<tr>
		<td>${emNo.emNo}</td>
		<td>${emNo.emName }</td>
		<td>${emNo.emId }</td>
		<td><input type="text" value="${emNo.emPhone }" name="emPhone"/></td>
		<td><input type="text" value="${emNo.emEmail }" name="emEmail"/>		</td>
		<td><input type="text" value="${emNo.emAddr }" name="emAddr"/></td>
	</tr>
	<tr><td colspan="6">
		<input type="submit" value="완료"/>
	</td></tr>
</table>
</form>
</body>
</html>