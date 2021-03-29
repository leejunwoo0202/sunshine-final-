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
<%-- <form action="detail/${board.boardNo}"> --%>
<table border="1"  name="frm" id="frm" >

<tr>
<td>글번호</td>
<td>회원아이디</td>
<td>제목</td><td>내용</td>
<td>작성일</td>
</tr>
<c:forEach items="${lists }" var="board" varStatus="status"  >
<tr>
<td><input type="hidden" name="boardNo" value="${board.boardNo }" />
	<a href="detail?boardNo=${board.boardNo }">${board.boardNo }</a></td>
<td>${board.memId }</td>
<td>${board.bSubject }</td>
<td>${board.bContent}</td>
<td>${board.bWriteDate }</td>
</tr>
</c:forEach>
</table>
<!-- </form> -->
<%@ include file="../include/includePage.jsp" %><br />
<a href="../main">메인화면</a>

<c:if test="${count == 0 }">
등록된 글이 없습니다. <br />
</c:if>
</body>
</html>