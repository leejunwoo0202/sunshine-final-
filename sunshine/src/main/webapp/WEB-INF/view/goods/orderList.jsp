<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문페이지</title>
</head>
<body>
<h1>주문페이지</h1>
<table border="1">

<tr>
<th>상품정보</th>
</tr>
<tr>
<td>상품번호</td>
</tr>
<tr>
<td>${goodsDTO.goodsNum }</td>
</tr>
   
</table>
<br/>
<br/>
<br/>
<table border="1">

<tr>
<th>구매자 정보</th>
</tr>
<tr>
<td>회원번호</td>
<td>회원이름</td>
<td>회원아이디</td>
<td>회원전화번호</td>
<td>회원이메일</td>
<td>회원주소</td>
</tr>
<tr>           
<td>${memDTO.memNo }</td>
<td>${memDTO.memName }</td>
<td>${memDTO.memId }</td>
<td>${memDTO.memPhone }</td>
<td>${memDTO.memEmail }</td>
<td>${memDTO.memAddr }</td>
</tr>
</table>
</body>
</html>