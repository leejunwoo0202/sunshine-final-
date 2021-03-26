<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨텐츠 등록 페이지</title>
</head>
<body>
<form action="contentsRegistOk" method="post" name="frm">
<table border="1">
	<tr><td>컨텐츠명</td>
		<td><input type="text" name="contentsName"/></td></tr>
	<tr><td>컨텐츠 가격</td>
		<td><input type="text" name="contentsPrice" /></td></tr>
	<tr><td>연령구분</td>
		<td><input type="text" name="divPeople"/></td></tr>
	<tr><td>발급일</td>
		<td><input type="text" name="issueDate"/></td></tr>
	<tr><td>유효기간</td>
		<td><input type="date" name="validity"/></td></tr>
	<tr><td>등급</td>
		<td><input type="text" name="grade"/></td></tr>
		<tr><td colspan="2">
		<input type="submit" value="등록" />
		<input type="reset" value="초기화" />
		</td></tr>
		
<!-- 회원입장에서 예약할 때 -->
<!-- 		<tr> -->
<!-- 			<th></th> -->
<!-- 			<th>상품명</th> -->
<!-- 			<th>구분</th> -->
<!-- 			<th>가격</th> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<th>1. 리프트</th> -->
<!-- 			<td> -->
<!-- 			<select> -->
<!-- 				<option value="주간권">주간권</option> -->
<!-- 				<option value="오전권/오후권">오전권/오후권</option> -->
<!-- 				<option value="야간권">야간권</option> -->
<!-- 				<option>오후 야간권</option> -->
<!-- 				<option>심야권</option> -->
<!-- 				<option>야간심야권</option> -->
<!-- 				<option>1회권</option> -->
<!-- 			</select> -->
<!-- 			</td> -->
<!-- 			<td> -->
<!-- 				<select> -->
<!-- 					<option>대인</option> -->
<!-- 					<option>소인</option> -->
<!-- 				</select> -->
<!-- 			</td> -->
<!-- 			<td> -->		
<!-- 			</td> -->
<!-- 		</tr> -->
</table>
</form>

<div><br />
 * 심야권/야간심야권 운영일 : 2/6(토), 2/11~2/13(목~토), 2/20(토), 2/27(토), 3/6(토)<br />
 * <span class="textcolor" style="color:#FF6347;">모든 금액은 보증금 1,000원이 포함되어 있습니다.(A deposit of 1,000KRW for RFID Card is included in rate.)</span><br />
 * 보증금 환급기에 티켓을 반납하시면 보증금을 환급받으실 수 있습니다.(Your deposit will be refunded once RFID Card is returned to any nearest kiosk.)<br />
 * 소인은 만 12세 이하에 한 합니다.(Children must be under the age of 12.)<br />
 * 모든 티켓은 당일에 한 합니다.(All tickets are valid for day of purchase.)<br />
 * 1회권은 할인되지 않습니다.(One-time tickets are not discountable.)<br />
 * 구입하신 티켓은 환불 및 교환되지 않습니다.(All tickets are non-refundable and non-transferable.)<br />
 * 티켓 분실시 재발급되지 않습니다.(Tickets are not reissuabhle when lost.)<br />
 * 모든 금액은 부가가치세 포함 금액입니다.(10% VAT is included in rate.)
</div>
</body>
</html>