<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
      <td>컨텐츠 번호</td><td>컨텐츠명</td><td>컨텐츠 가격</td><td>연령구분</td>
	  <td>발급일</td><td>유효기간</td><td>등급</td></tr>
	  <c:forEach var="contents" items="${list }" varStatus="status">
	   <tr>
	   <td><a href="contentsDetail?contentsNo=${contents.contentsNo}">${contents.contentsNo }</a></td>
	   <td>${contents.contentsName }</td>
	   <td>${contents.contentsPrice }</td>
	   <td>${contents.divPeople }</td>
	   <td>${contents.issueDate }</td>
	   <td>${contents.validity }</td>
	   <td>${contents.contentsDiv }</td>
	   </tr>
	  </c:forEach>
</table>
</body>
</html>