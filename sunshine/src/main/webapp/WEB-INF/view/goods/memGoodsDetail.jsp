<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="orderInsert"  method="post">
<input type="hidden" name="goodsNum" value="${goods.goodsNum}"/>
<table border="1">
<tr><th>상품번호</th> 
<th>상품이름</th> 
<th>상품가격</th> 
<th>상품개수 </th> 
<th>상품종류</th> 
<th>상품설명</th> 
<th>이미지</th> </tr>
<tr>
<td>${goods.goodsNum }</td>
<td>${goods.goodsName }</td>
<td>${goods.goodsPrice}</td>
<td>${goods.goodsAmount}</td>
<td>${goods.goodsCategori}</td>
<td>${goods.goodsContent}</td>
<td><c:forTokens items="${goods.goodsImage }" delims="`" var="img" >
	<img src="../goods/upload/${img }" width="500" height="500"/><br />
</c:forTokens></tr>
<tr><td>
<input type="submit" value="주문"/>
</td></tr>
</table>
</form>

<a href="list">상품리스트</a>
</body>
</html>