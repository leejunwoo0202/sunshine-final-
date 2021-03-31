<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정페이지 입니다.</title>
</head>
<body>
<form action="contentsModifyOk" method="post" name="frm">
<input type="hidden" name="contentsNo" value="${contents.contentsNo }" />
<table border="1">
<tr>
<td>컨텐츠 번호</td>
<td>컨텐츠 명</td>
<td>컨텐츠 가격</td>
<td>연령 구분</td>
<td>발급일</td>
<td>유효기간</td>
<td>등급</td>
</tr>
<tr>
<td>${contents.contentsNo }</td>
<td><input type="text" value="${contents.contentsName }" name="contentsName" readonly="readonly"/></td>
<td><input type="text" value="${contents.contentsPrice }" name="contentsPrice"/></td>
<td>${contents.divPeople }</td>
<td>${contents.issueDate }</td>
<td>${contents.validity }</td>
<td><input type="text" value="${contents.grade }" name="grade"/></td>
</tr>
<tr><td colspan="7">
	<input type="submit" value="완료"/>
	</td></tr>
</table>
</form>
</body>
</html>