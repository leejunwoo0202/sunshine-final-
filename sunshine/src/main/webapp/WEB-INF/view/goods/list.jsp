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
상품번호 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
상품이름 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
상품가격 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
상품개수 : ${count }<br/><br/><br/><br/>
상품종류 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
상품설명 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
이미지 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<c:forEach items="${list }" var="dto" varStatus="cnt">

<!--  페이징 -->
<a href="goodsDetail?goodsNum=${dto.goodsNum }">${dto.goodsNum }</a>&nbsp;
<!--  -->
      ${dto.goodsNum }
      ${dto.goodsName }
      ${dto.goodsPrice }
      ${dto.goodsCategori }
      ${dto.goodsContent }
      <c:forTokens items="${dto.goodsImage }" delims="`"
      var="i" begin="0" end="0">
      <img alt="" src="../goods/upload/${i }" width="50px">
      
</c:forTokens>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${dto.goodsName }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<fmt:formatNumber value="${dto.goodsPrice }" type="currency"/><br/>
</c:forEach>
<%@ include file="../include/includePage.jsp" %>
<div><a href="insert">상품등록</a></div>
</body>
</html>