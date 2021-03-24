<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제화면</title>
</head>
<body>
주문완료

<form action="paymentInsertPro" method="post">
<input type="hidden" name="mOrderNum" value="${mOrderNum }">
<table border="1">
<tr><th>배송지 정보 입력</th></tr>
<tr><th>배송지주소</th><td><input type="text" name="deliveryAddress"></td></tr>
</table>

<table border="1">
<tr><th>결제정보</th></tr>
<tr><th>결제방법</th>
<td><select id="payDivision" name="payDivision">
            <option value="card" >카드</option>
            <option value="cash" >무통장입금</option>
            <option value="phone" >휴대폰결제</option>
</select></td></tr>
<tr><td><input type="submit" value="결제"/></td></tr>   
		
		
</table>
<a href="list">상품리스트</a>
</form>
</body>
</html>