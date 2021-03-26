<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>restaurantPayMg 결제관리</title>
</head>
<body>
<form action="restaurant/payForm" >
<h1>레스토랑 결제 관리</h1>
<br>
<table border="1">
<tr>
<th>결제번호</th>
<th>주문번호</th>
<th>결제일</th>
<th>결제방법</th>
<th>총합계</th>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</table>
<input type="submit" value="등록">
<input type="button"  value ="뒤로" onclick="javascript:location.href='../restaurant/restaurantMain'"/>  
</form>
</body>
</html>