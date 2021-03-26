<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제내역</title>
</head>
<body>
<table border="1">
<tr><td>결제번호</td><td>배송지</td><td>결제구분</td><td>입금확인</td>
<td>상품구분</td><td>상품내용</td></tr>
<tr>
<c:forEach items="${list}" var="paymentDTO" varStatus="cnt">
<td>${paymentDTO.payNum}</td>
<td>${paymentDTO.deliveryAddress }</td>
<td>${paymentDTO.payDivision}</td>
<td>${paymentDTO.depositChk}</td>
<td>${paymentDTO.goodsCategori }</td>
<td>${paymentDTO.goodsContent }</td>


</tr>
</c:forEach>
</table>
<%@ include file="../include/includePage.jsp" %><br/>
<a href="list">상품리스트</a>
</body>
</html>