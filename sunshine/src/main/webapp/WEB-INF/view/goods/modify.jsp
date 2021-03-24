<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" 
	src="<c:url value='/js/jquery.form.js' />"></script>
<script type="text/javascript">
function fileDelete(imgFile,btn){
	aaa = {
			type:"post",
			url:"imgDel",
			dataType:"text",
			data:{"imgfile":imgFile},
			success:function(result){
				if(result.trim() == "1"){
					$(btn).text("삭제 취소");
				}else{
					$(btn).text("삭제");
				}
			},
			error :function(){
				alert('에러');
				return false;
			}
	};
	$.ajax(aaa);
}
</script>
</head>
<body>

<form action="modifyPro" method="post" enctype="multipart/form-data">
<input type="hidden" name="goodsNum" value="${goods.goodsNum}"/>

<table border="1">
<tr>
<th>상품번호</th> 
<th>상품이름</th> 
<th>상품가격</th> 
<th>상품개수 </th> 
<th>상품종류</th> 
<th>상품설명</th> 
<th>이미지</th> </tr>
<tr>
<td>${goods.goodsNum }</td>
<td><input type="text" name="goodsName" value="${goods.goodsName }"/></td>
<td><input type="text" name="goodsPrice" value="${goods.goodsPrice}"/></td>
<td><input type="text" name="goodsAmount" value="${goods.goodsAmount}"/></td>
<td><input type="text" name="goodsCategori"value="${goods.goodsCategori}"/></td>
<td><textarea rows="10" cols="50" name="goodsContent">${goods.goodsContent}</textarea></td>
<td><c:forTokens items="${goods.goodsImage }" delims="`" var="img" >
	<img src="../goods/upload/${img }" width="400" height="500"/><br />
	<%-- <button type="button" onclick="delete('${img }',this);">삭제</button> --%>
</c:forTokens></tr>
<tr>

<td colspan="7" align="center">
<input type="submit" value="수정"/>
<a href="main" >메인</a>
</td>
</tr>
</table>
</form>
</body>
</html>