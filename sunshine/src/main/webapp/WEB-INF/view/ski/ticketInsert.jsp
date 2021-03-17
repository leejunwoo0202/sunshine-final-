<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TicketManager</title>
</head>
<body>
<form action="ticketIssue" method="post" name="frm">
<table border="1">
	<tr><td>티켓번호</td>
		<td><input type="text" name="ticketNo"/></td></tr> <!-- 자동발생 할 것 -->
	<tr><td>티켓종류</td><td>
                        <select name = "ticketKind">
                           <option value ="101">주간권</option>
                           <option value ="102">오전권/오후권</option>
                           <option value ="103">야간권</option>
                           <option value ="104">오후 야간권</option>
                           <option value ="105">심야권</option>
                           <option value ="106">야간심야권</option>
                           <option value ="107">1회권</option>
				</select></td></tr>
	<tr><td>티켓가격</td>
		<td><input type="text" name="ticketPrice"/></td></tr>
	<tr><td>구분대상</td>
		<td><input type="radio" name="divPeople" value="child"/>소인
			   <input type="radio" name="divPeople" value="adult" checked="checked"/>대인</td></tr>
	<tr><td>이용시간</td>
		<td><input type="text" name="validity"/></td></tr>
		<tr><td colspan="2">
		<input type="submit" value="등록" />
		<input type="reset" value="초기화" />
		</td></tr>
</table>
</form>
</body>
</html>