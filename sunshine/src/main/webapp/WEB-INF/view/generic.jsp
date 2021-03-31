<<<<<<< HEAD
<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>Generic Page - Industrious by TEMPLATED</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="main">sunshine</a>

	</header>



	<!-- Heading -->
	<div id="heading">
		<h1>상품수정</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<table border="1">
<tr><td>결제번호</td><td>배송지</td><td>결제구분</td><td>입금확인</td>
<td>상품구분</td><td>상품내용</td></tr>
<tr>
<c:forEach items="${list}" var="paymentDTO" varStatus="cnt">
<td>${paymentDTO.payNum}</td>
<td>${paymentDTO.deliveryAddress }</td>
<td>${paymentDTO.payDivision}</td>
<td>${paymentDTO.depositChk}</td>
<td>${paymentDTO.goodsCategori }</td>
<td>${paymentDTO.goodsContent }</td>


</tr>
</c:forEach>
</table>
<%@ include file="../include/includePage.jsp" %><br/>
<a href="list">상품리스트</a>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Company Introduction</h3>
					<p>
						대표자 : OOO | 개인정보보호책임자 : OOO | 통신판매신고 : 제 ####-##호 <br />공정위
						사업자등록번호 ###-##-##### 회원제예약실 : 02-000-0001 ~ 3 회원제프론트 :
						030-000-0001 ~ 2 퍼블릭프론트 : 030-000-0000 ~ 2 <br /> 상품판매부 :
						020-000-0000 | 식음료 : 050-222-0000 <br /> 연습장 : 000-111-0000
						스키장&콘도 : 000-111-2222 <br /> <a href="#">[업장 전화안내 바로가기]</a><br />
						업장 주소 : OO시 OO구 OO면 대로2222번길 66(OO면 O리 산OO-1번지)<br /> 스키장/콘도 주소 :
						OO시 OO면 OO로 111(OO면 OO리 산44-3번지)
					</p>
				</section>
				<section>
					<h4>Terms And Conditions</h4>
					<ul class="alt">
						<li><a href="#">홈페이지 이용약관</a></li>
						<li><a href="#">채용 정보</a></li>
						<li><a href="#">개인정보 처리방침</a></li>
						<li><a href="#">영상정보처리기기 운영관리방침</a></li>
					</ul>
				</section>
				<section>
					<h4>Messenger</h4>
					<ul class="plain">
						<li><a href="https://twitter.com/"><i
								class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="https://www.facebook.com/"><i
								class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="https://www.instagram.com/"><i
								class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="https://github.com/"><i
								class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">&copy; Sunshine Village</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="../assets/js/jquery.min.js"></script>
	<script src="../assets/js/browser.min.js"></script>
	<script src="../assets/js/breakpoints.min.js"></script>
	<script src="../assets/js/util.js"></script>
	<script src="../assets/js/main.js"></script>

</body>
=======
<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>Generic Page - Industrious by TEMPLATED</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="main">sunshine</a>

	</header>



	<!-- Heading -->
	<div id="heading">
		<h1>상품수정</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<table border="1">
<tr><td>결제번호</td><td>배송지</td><td>결제구분</td><td>입금확인</td>
<td>상품구분</td><td>상품내용</td></tr>
<tr>
<c:forEach items="${list}" var="paymentDTO" varStatus="cnt">
<td>${paymentDTO.payNum}</td>
<td>${paymentDTO.deliveryAddress }</td>
<td>${paymentDTO.payDivision}</td>
<td>${paymentDTO.depositChk}</td>
<td>${paymentDTO.goodsCategori }</td>
<td>${paymentDTO.goodsContent }</td>


</tr>
</c:forEach>
</table>
<%@ include file="../include/includePage.jsp" %><br/>
<a href="list">상품리스트</a>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Company Introduction</h3>
					<p>
						대표자 : OOO | 개인정보보호책임자 : OOO | 통신판매신고 : 제 ####-##호 <br />공정위
						사업자등록번호 ###-##-##### 회원제예약실 : 02-000-0001 ~ 3 회원제프론트 :
						030-000-0001 ~ 2 퍼블릭프론트 : 030-000-0000 ~ 2 <br /> 상품판매부 :
						020-000-0000 | 식음료 : 050-222-0000 <br /> 연습장 : 000-111-0000
						스키장&콘도 : 000-111-2222 <br /> <a href="#">[업장 전화안내 바로가기]</a><br />
						업장 주소 : OO시 OO구 OO면 대로2222번길 66(OO면 O리 산OO-1번지)<br /> 스키장/콘도 주소 :
						OO시 OO면 OO로 111(OO면 OO리 산44-3번지)
					</p>
				</section>
				<section>
					<h4>Terms And Conditions</h4>
					<ul class="alt">
						<li><a href="#">홈페이지 이용약관</a></li>
						<li><a href="#">채용 정보</a></li>
						<li><a href="#">개인정보 처리방침</a></li>
						<li><a href="#">영상정보처리기기 운영관리방침</a></li>
					</ul>
				</section>
				<section>
					<h4>Messenger</h4>
					<ul class="plain">
						<li><a href="https://twitter.com/"><i
								class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="https://www.facebook.com/"><i
								class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="https://www.instagram.com/"><i
								class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="https://github.com/"><i
								class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">&copy; Sunshine Village</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="../assets/js/jquery.min.js"></script>
	<script src="../assets/js/browser.min.js"></script>
	<script src="../assets/js/breakpoints.min.js"></script>
	<script src="../assets/js/util.js"></script>
	<script src="../assets/js/main.js"></script>

</body>
>>>>>>> branch 'master' of https://github.com/leejunwoo0202/sunshine-final-.git
</html>