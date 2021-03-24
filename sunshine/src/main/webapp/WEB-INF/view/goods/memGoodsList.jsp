<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트(멤버)</title>
</head>
<body>
상품리스트<br/>
<table border="1">

<tr><th>상품번호</th> 
<th>상품이름</th> 
<th>상품가격</th> 
<th>상품개수 </th> 
<th>상품종류</th> 
<th>상품설명</th> 
<th>이미지</th> </tr>
<c:forEach items="${list}" var="dto" varStatus="cnt">
<tr><td><a href="detail?goodsNum=${dto.goodsNum }">${dto.goodsNum }</a></td>
<td>${dto.goodsName }</td>
<td>${dto.goodsPrice}</td><td>${dto.goodsAmount}</td>
<td>${dto.goodsCategori}</td><td>${dto.goodsContent}</td>
<td><c:forTokens items="${dto.goodsImage }" delims="`"
      var="i" begin="0" end="0">
      <img alt="이미지" src="/goods/upload/${i }" width="50px">
      
</c:forTokens>
</td>
</tr>


</c:forEach>





</table>
<%@ include file="../include/includePage.jsp" %><br/>
<a href="list">상품리스트</a>
<a href="paymentList">결제내역</a>
</body>
</html>