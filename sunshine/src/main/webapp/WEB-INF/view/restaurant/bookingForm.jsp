<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookingForm 예약 등록 페이지</title>
</head>
<body>
<form action="#">
<h1>레스토랑 예약 등록</h1>
<br>
<table>
	<tr>
		<th>예약번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>회원번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>회원ID</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>좌석유형</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>알레르기</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>아동동반</th>
		<td><input type="text"></td>
	</tr>
</table>
<input type="submit" value="등록">
<input type="button"  value ="뒤로" onclick="javascript:location.href='../restaurant/restaurantMain'"/>  
</form>
</body>
</html>