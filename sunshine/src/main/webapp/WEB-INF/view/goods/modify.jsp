<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../include/include.jsp" %>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>Generic Page - Industrious by TEMPLATED</title>
<style>
#table {
    width: 1000px;
    height:1000px;
    
  }
  th{
    width:400px;
    height:200px;
    border-collapse:seperate;
    border-spacing: 10px;
  }
  
  td{
     width:400px;
     height:200px;
     border-collapse:seperate;
     border-spacing: 10px;
  }
  
</style>
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
			<form action="modifyPro" method="post" enctype="multipart/form-data">
<input type="hidden" name="goodsNum" value="${goods.goodsNum}"/>
<input type="hidden" name="goodsImage1" value="${goods.goodsImage }"/>
<table border="1"  id="table">
<tr>
<th>상품번호</th> 
<th>상품이름</th> 
<th>상품가격</th> 
<th>상품개수 </th> 
<th>상품종류</th> 
<th>상품설명</th> 
<th colspan="2">이미지</th> </tr>
<tr>
<td>${goods.goodsNum }</td>
<td><input type="text" name="goodsName" value="${goods.goodsName }"/></td>
<td><input type="text" name="goodsPrice" value="${goods.goodsPrice}"/></td>
<td><input type="text" name="goodsAmount" value="${goods.goodsAmount}"/></td>
<td><input type="text" name="goodsCategori"value="${goods.goodsCategori}"/></td>
<td><textarea rows="10" cols="50" name="goodsContent">${goods.goodsContent}</textarea></td>
<td><input type="file" name="goodsImage" /></td>
<td><c:forTokens items="${goods.goodsImage }" delims="`" var="img" >
	<img src="../goods/upload/${img }" width="400" height="500"/><br />
	
</c:forTokens></tr>
<tr>

<td colspan="8" align="center">
<input type="submit" value="수정"/>

</td>
</tr>
</table>
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
						020-000-0000 | 식음료 : 050-222-0000 <br /> 연습장 : 000-111-0000 스키장&콘도
						: 000-111-2222 <br /> <a href="#">[업장 전화안내 바로가기]</a><br /> 업장 주소
						: OO시 OO구 OO면 대로2222번길 66(OO면 O리 산OO-1번지)<br /> 스키장/콘도 주소 : OO시
						OO면 OO로 111(OO면 OO리 산44-3번지)
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
</html>