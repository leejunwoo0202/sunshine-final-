<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menuForm 메뉴 등록 페이지</title>
</head>
<body>
<form action="#">
<h1>레스토랑 메뉴 등록</h1>
<br>
<table>
	<tr>
		<th>메뉴번호</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>메뉴이름</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>회원ID</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>메뉴가격</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>메뉴사진</th>
		<td><input type="text"></td>
	</tr>
	
	<tr>
		<th>메뉴설명</th>
		<td><input type="text"></td>
	</tr>

</table>
<input type="submit" value="등록">
<input type="button"  value ="뒤로" onclick="javascript:location.href='../restaurant/restaurantMain'"/>  
</form>
</body>
</html>