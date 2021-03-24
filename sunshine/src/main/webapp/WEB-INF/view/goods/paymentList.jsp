<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제내역</title>
</head>
<body>
<table border="1">
<tr><td>결제번호</td><td>주문번호</td><td>배송지</td><td>결제구분</td><td>입금확인</td></tr>
<tr><td>${list.payNum }</td><td>${list.mOrderNum }</td><td>${list.deliveryAddress }</td>
<td>${list.payDivision }</td><td>${list.depositChk }</td></tr>
</table>
</body>
</html>