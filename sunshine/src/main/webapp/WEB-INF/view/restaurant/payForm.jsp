<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>payForm 결제 등록 페이지</title>
</head>
<body>
<form action="#">
<h1>레스토랑 결제 등록</h1>
<br>
<table>
	<tr>
		<th>결제번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>주문번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>결제일</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>결제방법</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>총합계</th>
		<td><input type="text"></td>
	</tr>
</table>
<input type="submit" value="등록">
<input type="button"  value ="뒤로" onclick="javascript:location.href='../restaurant/restaurantMain'"/>  
</form>
</body>
</html>