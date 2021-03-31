<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="rservRegist" method="post">
							<table border="1" summary="권종, 이용시간, 구분, 리프트권  항목을 포함한 리프트요금 정보 표" class="tblY tdLine" >
							<caption>20/21시즌 리프트권 요금</caption>
								<colgroup>
									<col width="20%" />
									<col width="20%" />
									<col width="20%" />
									<col width="20%" />
								</colgroup>
								<thead>
									<tr>
										<th scope="col" class="brln concenter">권 종</th>
										<th scope="col">이용 시간</th>
										<th scope="col">구 분</th>
										<th scope="col">리프트권</th>
									</tr>
								</thead>
								<tbody>
								<tr>
								<td class="brln" style="text-align: center;" colspan="4">2020/12/01~</td>
								</tr>
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">주간권</td>
										<td rowspan="2" >09:00~17:00</td>
										<td>대인</td>
										<td>82,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>68,000</td>
									</tr>
									
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">오전권/오후권</td>
										<td rowspan="2" >오전 : 09:00~13:00<br />오후 : 13:00~17:00</td>
										<td>대인</td>
										<td>64,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>53,000</td>
									</tr>
									
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">야간권</td>
										<td rowspan="2">18:30~21:30</td>
										<td>대인</td>
										<td>58,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>48,000</td>
									</tr>									
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">오후 야간권</td>
										<td rowspan="2">13:00 ~ 21:30<br>브레이크 타임 17:00~18:30</td>
										<td>대인</td>
										<td>93,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>76,000</td>
									</tr>
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">심야권</td>
										<td rowspan="2">20:00 ~ 23:00</td>
										<td>대인</td>
										<td>52,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>43,000</td>
									</tr>
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">야간심야권</td>
										<td rowspan="2">18:30 ~ 23:00</td>
										<td>대인</td>
										<td>72,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>59,000</td>
									</tr>
									<tr>
										<td rowspan="2" class="bgBlue brln concenter">1회권</td>
										<td rowspan="2">-</td>
										<td>대인</td>
										<td>16,000</td>
									</tr>
									<tr>
										<td>소인</td>
										<td>13,000</td>
									</tr>
							</tbody>
							</table>
							<div class="box type3 last">
								<strong class="hdObj">주의사항</strong>
								<ul class="listCont sizeUp">
									<li>심야권/야간심야권 운영일 : 2/6(토), 2/11~2/13(목~토), 2/20(토), 2/27(토), 3/6(토)</li>
									<li><font style="color: red;font-weight: bold;">모든 금액은 보증금 1,000원이 포함되어 있습니다.(A deposit of 1,000KRW for RFID Card is included in rate.)</font></li>													
									<li>보증금 환급기에 티켓을 반납하시면 보증금을 환급받으실 수 있습니다.(Your deposit will be refunded once RFID Card is returned to any nearest kiosk.)</li>
									<li>소인은 만 12세 이하에 한 합니다.(Children must be under the age of 12.)</li>
									<li>모든 티켓은 당일에 한 합니다.(All tickets are valid for day of purchase.)</li>
									<li>1회권은 할인되지 않습니다.(One-time tickets are not discountable.)</li>
									<li>구입하신 티켓은 환불 및 교환되지 않습니다.(All tickets are non-refundable and non-transferable.)</li>
									<li>티켓 분실시 재발급되지 않습니다.(Tickets are not reissuabhle when lost.)</li>
									<li>모든 금액은 부가가치세 포함 금액입니다.(10% VAT is included in rate.)</li>
								</ul>
						</div>
						<input type="submit" value="예약"/>
</form>
</body>
</html>