<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내정보</title>
</head>
<body>
<c:if test="${loginInfo.grade eq 'mem' }">
	<h2>회원 정보</h2>
	회원번호 : ${memDto.memNo }<br/>
	이름 : ${memDto.memName }<br/>
	아이디 : ${memDto.memId }<br/>
	전화번호 : ${memDto.memPhone }<br/>
	이메일 : ${memDto.memEmail }<br/>
	주소 : ${memDto.memAddr }<br/>
	가입일 : ${memDto.memRegist }<br/>
	<hr />
	<a href="memberModify">비밀번호바꾸기</a>
	<a href="../main">메인화면</a>
</c:if>
<c:if test="${loginInfo.grade eq 'em' }">
	<h2>직원 정보</h2>
	회원번호 : ${empDto.emNo }<br/>
	이름 : ${empDto.emName }<br/>
	아이디 : ${empDto.emId }<br/>
	전화번호 : ${empDto.emPhone }<br/>
	이메일 : ${empDto.emEmail }<br/>
	주소 : ${empDto.emAddr }<br/>
	가입일 : ${empDto.emRegist }<br/>
	<hr />
	<a href="../main">메인화면</a>
</c:if>




</body>
</html>