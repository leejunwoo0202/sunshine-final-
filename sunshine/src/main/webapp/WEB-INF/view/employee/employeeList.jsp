<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 리스트</title>
</head>
<body>
<table border="1">
<tr>
      <td>직원번호</td><td>직원명</td><td>직원ID</td><td>직원연락처</td>
	  <td>직원Email</td><td>직원주소</td></tr>
	<c:forEach var="em" items="${list }" varStatus="status">
	<tr>
		<td><a href="employeeDetail?emNo=${em.emNo}">${em.emNo}</a></td>
		<td>${em.emName }</td>
		<td>${em.emId }</td>
		<td>${em.emPhone }</td>
		<td>${em.emEmail }</td>
		<td>${em.emAddr }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>