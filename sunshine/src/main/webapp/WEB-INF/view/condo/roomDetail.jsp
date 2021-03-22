<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="room" items="${list }">
		<tr>
			<td>${room.roomNum}</a></td>
			<td>${room.roomType}</td>
			<td>${room.roomPrice}</td>
			<td><c:forTokens items="${room.roomImage }" delims="`" var="img"
					varStatus="status" >
					<!--  
							<img alt="img" src="WEB-INF/view/condo/upload/${img }" />
							-->
					<img alt="img" src="/condo/upload/${img }" width="200px" />
				</c:forTokens></td>
		</tr>
	</c:forEach>
</body>
</html>