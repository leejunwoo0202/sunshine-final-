<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
</head>
<body>
<form:form action="insertPro" method="post" name="frm"
   enctype="multipart/form-data" modelAttribute="goodsCommand">
   
   
   상품명 :  <form:input path="goodsName" /><br/>
   
   상품가격 : <form:input path="goodsPrice" /><br/>
   
   상품수량 : <form:input path="goodsAmount" /><br/>
   
   상품종류 : <form:input path="goodsCategori" /><br/>
   
   상품내용 : <form:input path="goodsContent" /><br/>
   
   상품이미지 : <input type="file" name="goodsImage"
              multiple="multiple" /><br/>
   
   <input type="submit" value="상품등록" />
   <input type="reset" value="취소"/>    
   

</form:form>
<a href="main" >메인</a><br/>

</body>
</html>