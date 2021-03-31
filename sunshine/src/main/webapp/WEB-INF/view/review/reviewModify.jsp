<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
<form action="modifyPro" method="post" >
<input type="hidden" name="boardNo" value="${detail.boardNo }"/>
<input type="hidden" name="memId" value="${detail.memId }"/>
<table border="1">
<tr>
<td>글번호</td>
<td>회원아이디</td>
<td>제목</td><td>내용</td>
<td>작성일</td>
</tr>
<tr>
<td>${detail.boardNo }</td>
<td>${detail.memId }</td>
<td><input type="text" name="bSubject" value="${detail.bSubject }"/></td>
<td><input type="text" name="bContent" value="${detail.bContent}"/></td>
<td>${detail.bWriteDate }</td>
</tr>
<tr><td colspan="5"><input type="submit" value="수정"/></td></tr>
</table>
</form>



</body>
</html>