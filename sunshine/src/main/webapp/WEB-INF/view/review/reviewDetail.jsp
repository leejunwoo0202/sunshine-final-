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
<form action="../reviewEm/emAnswer">
<input type="hidden" name="boardNo" value="${detail.boardNo }"/>

<table border="1">
<tr><th>리뷰</th></tr>
<tr>
<td>글번호</td>
<td>회원아이디</td>
<td>제목</td><td>내용</td>
<td>작성일</td>
</tr>
<tr>
<td>${detail.boardNo }</td>
<td>${detail.memId }</td>
<td>${detail.bSubject }</td>
<td>${detail.bContent}</td>
<td>${detail.bWriteDate }</td>
</tr>
</table>
<a href="delete?boardNo=${detail.boardNo }">리뷰삭제</a>
<a href="modify?boardNo=${detail.boardNo }">리뷰수정</a>
<br/><br/><br/><br/>

<!-- 주소에서 boardNo으로 넘어오는데 reply에 boarNo가 없어서 오류가 나는거야 준우야 -->
<!-- 그래서 주소창에 boardNo가 아니라 다른 값으로 주소 넘어오거나 -->
<!--  reply에 boardNo값이 있어야해 무슨말인지 알지..? -->








     <c:choose>
     <c:when test="${reply ne null }">
	<table border="1" >
	<tr><th colspan="3">답변</th></tr>
	<tr><td>답변번호</td><td>작성자</td><td>답변</td><td>날짜</td></tr>
	<tr><td>${reply[0].replyNo }</td><td>${reply[0].emId }</td><td>${reply[0].replyContent }</td><td>${reply[0].replyWriteDate }</td></tr>
	</table>
	</c:when>

      <c:when test="${reply eq null }">
	 댓글 없음 <hr />
	 <a href="#" >
	 댓글 추가
	 </a>
	</c:when>
	</c:choose>
<br/><br/><br/><br/><br/><br/><br/> 
  

<table border="1">
<tr><td colspan="2">답변하기</td></tr>
<tr><td colspan="2"><textarea name="replyContent"  cols="50" rows="30"></textarea></td></tr>
<tr><td>직원아이디</td><td><input type="text" name="emId"/></td></tr>
<tr><td>비밀번호확인</td><td><input type="password" name="oldPw"/></tr> 
<tr><td colspan="2"><input type="submit" value="답변작성"/></td></tr>
</table>
</form>


</body>
</html>