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
회원번호 : ${memDto.memNo }<br/>
이름 : ${memDto.memName }<br/>
아이디 : ${memDto.memId }<br/>
전화번호 : ${memDto.memPhone }<br/>
이메일 : ${memDto.memEmail }<br/>
주소 : ${memDto.memAddr }<br/>
가입일 : ${memDto.memRegist }<br/>
<a href="../main">메인화면</a>




</body>
</html>