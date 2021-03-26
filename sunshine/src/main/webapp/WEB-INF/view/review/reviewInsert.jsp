<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후기쓰기</title>
</head>
<body>
<h1>후기쓰기</h1>
<form action="reviewInsertPro" name="frm" id="frm">
<table border="1">
<tr>
<tr><td><input type="text" name="bSubject" placeholder="제목"></td></tr>
<tr><td><textarea name="bContent" cols="40" rows="8"  placeholder="내용"></textarea></td>
</tr>
<tr>
<td><input type="submit" value="후기작성"></td>

</tr>

</table>

</form>
<a href="main">메인페이지</a>
</body>
</html>