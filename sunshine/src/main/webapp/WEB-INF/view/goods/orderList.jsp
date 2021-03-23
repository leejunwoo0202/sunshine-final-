<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문페이지</title>


</head>
<body>
<h1>주문페이지</h1>
<form action="paymentInsert" name="frm" id="frm" method="post">
<input type="hidden" name="goodsNum" value="${goodsDTO.goodsNum }">
<input type="hidden" name="goodsPrice" value="${goodsDTO.goodsPrice }">

<input type="hidden" name="memNo" value="${memDTO.memNo}">
<input type="hidden" name="memName" value="${memDTO.memName}">
<input type="hidden" name="memId" value="${memDTO.memId }">
<input type="hidden" name="memPhone" value="${memDTO.memPhone }">
<input type="hidden" name="memEmail" value="${memDTO.memEmail }">
<input type="hidden" name="memAddr" value="${memDTO.memAddr }">

<table border="1">

<tr>
<th>상품정보</th>
</tr>
<tr>
<td>상품번호</td><td>상품이름</td>
<td>상품내용</td><td>상품가격</td><td>주문수량</td>
</tr>
<tr>
<td>${goodsDTO.goodsNum }</td>
<td>${goodsDTO.goodsName }</td>
<td>${goodsDTO.goodsContent }</td>
<td>${goodsDTO.goodsPrice }</td>
<td><input type="text" name="goodsAmountOrder" value="입력해주세요"></td>

	  
</tr>
   
</table>
<br/>
<br/>
<br/>
<table border="1">

<tr>
<th>구매자 정보</th>
</tr>
<tr>
<td>회원번호</td>
<td>회원이름</td>
<td>회원아이디</td>
<td>회원전화번호</td>
<td>회원이메일</td>
<td>회원주소</td>
</tr>
<tr>           
<td>${memDTO.memNo }</td>
<td>${memDTO.memName }</td>
<td>${memDTO.memId }</td>
<td>${memDTO.memPhone }</td>
<td>${memDTO.memEmail }</td>
<td>${memDTO.memAddr }</td>
</tr>

</table>
<br/>

<input type="submit" value="전송">
</form>
</body>
</html>