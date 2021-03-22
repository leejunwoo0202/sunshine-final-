<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>roomserviceForm 룸서비스 등록 페이지</title>
</head>
<body>
<form action="#">
<h1>레스토랑 룸서비스 관리</h1>
<br>
<table>
	<tr>
		<th>룸서비스번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>객실번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>메뉴번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>접수시간</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>인원</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>비고</th>
		<td><input type="text"></td>
	</tr>
</table>
<input type="submit" value="등록">
<input type="button"  value ="뒤로" onclick="javascript:location.href='../restaurant/restaurantMain'"/>  
</form>
</body>
</html>