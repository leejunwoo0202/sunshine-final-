<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약페이지</title>
<!-- <script src="http://code.jquery.com/jquery-latest.js"></script> -->
<%-- <script type="text/javascript" src="<c:url value='/js/jquery.form.js'/>"></script> --%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
let res = $('.mydiv select').map(function(){
	   return $(this).val();
	}).get();
	console.log(res)
</script>
</head>
<body>
	<table border="1">
<!-- 		<tr> -->
<!-- 			<th colspan="4"> -->
<!-- 				<div class="mydiv"> -->
<!--   <select name="first"> -->
<!--     <option value="1" selected>One</option> -->
<!--     <option value="2">Two</option> -->
<!--   </select> -->
<!--   <select name="second"> -->
<!--     <option value="1">One</option> -->
<!--     <option value="2"  selected>Two</option> -->
<!--   </select> -->
<!-- </div> -->
<!-- <div class="mydiv"> -->
<!--   <select name="first"> -->
<!--     <option value="1">One</option> -->
<!--     <option value="2"  selected>Two</option> -->
<!--   </select> -->
<!--   <select name="second"> -->
<!--     <option value="1">One</option> -->
<!--     <option value="2"  selected>Two</option> -->
<!--   </select> -->
<!-- </div> -->
<!-- 			</th> -->
<!-- 		</tr> -->
		<tr>
			<th></th>
			<th>예약목록</th>
			<th>구분</th>
			<th>가격</th>
		</tr>
		
		<tr>
			<th>리프트권</th>
			<td><select id="ticketKind" name="contentsName">
					<option value="주간권">주간권</option>
					<option value="오전권/오후권">오전권/오후권</option>
					<option value="야간권">야간권</option>
					<option value="오후 야간권">오후 야간권</option>
					<option value="심야권">심야권</option>
					<option value="야간 심야권">야간심야권</option>
					<option value="1회권">1회권</option>
			</select></td>
			<td><select class="div" name="divPeople">
					<option value="대인">대인</option>
					<option value="소인">소인</option>
			</select></td>
			<td>
				<input type="text" name="contentsPrice" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<th>강습</th>
			<td><select id="ClassKind" name="contentsName">
					<option value="입문">입문</option>
					<option value="초급">초급</option>
					<option value="중급">중급</option>
					<option value="상급">상급</option>
					<option value="최상급">최상급</option>
			</select></td>
			<td><select class="div" name="divPeople">
					<option value="대인">대인</option>
					<option value="소인">소인</option>
			</select></td>
			<td>
				<input type="text" name="contentsPrice" readonly="readonly" />
			</td>
		</tr>
	</table>
<!-- <!-- 	<script type="text/javascript"> -->
<!-- // 		function getPrice(people) { -->
<!-- // 			var contentsName = document.getElementById('ticketKind').value; -->
<!-- // 			var data = { -->
<!-- // 					"contentsName" : contentsName -->
<!-- // 					,"divPeople" : people -->
<!-- // 			} -->
<!-- // 			console.log(data); -->
<!-- // 			getFee = { -->
<!-- // 				type : "post", -->
<!-- // 				url : "contentsPrice", -->
<!-- // 				data : data, -->
<!-- // 				dataType : "text", -->
<!-- // 				success : function(result) { -->
<!-- // 					console.log(result); -->
<!-- // 					$('input[name="contentsPrice"]').val(result); -->
<!-- // 				}, -->
<!-- // 				errors : function() { -->
<!-- // 					alert('errors'); -->
<!-- // 				} -->
<!-- // 			} -->
<!-- // 			$.ajax(getFee); -->
<!-- // 		} -->
<!-- 	</script> -->
</body>
</html>