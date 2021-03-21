<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트</title>
</head>
<body>
상품리스트<br/>
<table>

<tr><th>상품번호</th> 
<th>상품이름</th> 
<th>상품가격</th> 
<th>상품개수 </th> 
<th>상품종류</th> 
<th>상품설명</th> 
<th>이미지</th> </tr>
<c:forEach items="${list}" var="dto" varStatus="cnt">
<tr><td>${dto.goodsNum}</td><td>${dto.goodsName}</td>
<td>${dto.goodsPrice}</td><td>${dto.goodsAmount}</td>
<td>${dto.goodsCategori}</td><td>${dto.goodsContent}</td>
<td></td></tr>
${count}
<fmt:formatNumber value="${dto.goodsPrice }" type="currency"/><br/>
</c:forEach>
<%@ include file="../include/includePage.jsp" %>

</table>
<a href="insert">상품등록</a>
      
      <c:forTokens items="${dto.goodsImage }" delims="`"
      var="i" begin="0" end="0">
      <img alt="" src="../goods/upload/${i }" width="50px">
      
</c:forTokens>
<!--  페이징 -->
<a href="goodsDetail?goodsNum=${dto.goodsNum }">${dto.goodsNum }</a>&nbsp;
<!--  -->
</body>
</html>