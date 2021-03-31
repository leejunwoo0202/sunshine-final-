<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/include.jsp"%>
<!DOCTYPE HTML>

<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<meta charset="UTF-8">
<title>Sunshine Village</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>

<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<nav>
			<a class="logo" href="main"><img src="images/LogoSun2.jpg"
				alt="SunShine" id="SunShineLogo" /></a>
		</nav>
		<!--  로그아웃상태   -->
		<c:if test="${empty loginInfo }">
			<nav>
				<a href="login">로그인</a>
			</nav>
			<nav>
				<a href="register/regist">회원가입</a>
			</nav>
		</c:if>

		<c:if test="${!empty loginInfo }">
			<nav>
				<a href="logout">로그아웃</a>
			</nav>

			<nav>
				<a href="#menu">Menu</a>
			</nav>
		</c:if>
	</header>
	<!--  메뉴 -->


	<c:if test="${loginInfo.grade eq 'mem' }">
		<nav id="menu">
			<ul>
				<li><a href="main">Home</a></li>
				<li><a href="register/main">myPage</a>
				<li><a href="review/main">후기</a>
				<li><a href="condoMem/memList">객실리스트</a>
				<li><a href="goodsMem/list">상품리스트</a>
				<li><a href="rserv/rservMain">스키장 예약리스트</a>
				
			</ul>
		</nav>

	</c:if>

	<c:if test="${loginInfo.grade eq 'em' }">
		<nav id="menu">
			<ul>
				<li><a href="main">Home</a></li>
				<li><a href="register/main">myPage</a>
				<li><a href="review/main">후기</a>
				<li><a href="employee/employeeMain">직원등록</a>
				<li><a href="restaurant/restaurantMain">레스토랑</a>
				<li><a href="condo/condoMain">콘도</a>
				<li><a href="goods/main">프렌즈샵</a>
				<li><a href="ski/skiMain">스키장 컨텐츠 등록</a>
			</ul>
		</nav>

	</c:if>


	<!--  메뉴 -->



	<!-- Banner -->
	<section id="banner">
		<div class="inner">
			<h1>SunShine</h1>
			<p>	</p>
		</div>
		<video autoplay loop muted playsinline src="images/banner.mp4"></video>
	</section>

	<!-- Highlights -->
	<section class="wrapper">
		<div class="inner">
			<header class="special">
				<h2>Sem turpis amet semper</h2>
				<p>In arcu accumsan arcu adipiscing accumsan orci ac. Felis id
					enim aliquet. Accumsan ac integer lobortis commodo ornare aliquet
					accumsan erat tempus amet porttitor.</p>
			</header>
			<div class="highlights">
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-vcard-o"><span class="label">Icon</span></a>
							<h3>Feugiat consequat</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-files-o"><span class="label">Icon</span></a>
							<h3>Ante sem integer</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-floppy-o"><span class="label">Icon</span></a>
							<h3>Ipsum consequat</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-line-chart"><span class="label">Icon</span></a>
							<h3>Interdum gravida</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-paper-plane-o"><span class="label">Icon</span></a>
							<h3>Faucibus consequat</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
				<section>
					<div class="content">
						<header>
							<a href="#" class="icon fa-qrcode"><span class="label">Icon</span></a>
							<h3>Accumsan viverra</h3>
						</header>
						<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
							adipiscing gravida odio porttitor sem non mi integer non
							faucibus.</p>
					</div>
				</section>
			</div>
		</div>
	</section>

	<!-- CTA -->
	<section id="cta" class="wrapper">
		<div class="inner">
			<h2>Curabitur ullamcorper ultricies</h2>
			<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
				gravida odio porttitor sem non mi integer non faucibus ornare mi ut
				ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
				lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum
				dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit
				adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu
				faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac
				gravida.</p>
		</div>
	</section>

	<!-- Testimonials -->
	<section class="wrapper">
		<div class="inner">
			<header class="special">
				<h2>SUNSHINE FAMILY SITE</h2>
				<p><div style="color:red;" >SunShine</div>  다양한 관계사를 소개 합니다.</p>
			</header>
			<div class="testimonials">
				<section>
					<div class="content">
						<blockquote>
							<p>(스키 컨텐츠 소개 글) </p> 
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/pop02.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>스키강습</strong> <span> SKI_LESSON </span> 
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>Sunshine Village Condo</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/pop03.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>John Doe</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>프렌즈샵</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/pop01.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>asd</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
				
<!-- 					<section> -->
<!-- 					<div class="content"> -->
<!-- 						<blockquote> -->
<!-- 							<p>레스토랑</p>  -->
<!-- 						</blockquote> -->
<!-- 						<div class="author"> -->
<!-- 							<div class="image"> -->
<!-- 								<img src="images/pop04.jpg" alt="" /> -->
<!-- 							</div> -->
<!-- 							<p class="credit"> -->
<!-- 								- <strong>Janet Smith</strong> <span>CEO - ABC Inc.</span> -->
<!-- 							</p> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</section> -->
				
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
						030-000-0001 ~ 2 퍼블릭프론트 : 030-000-0000 ~ 2 <br />
						상품판매부 : 020-000-0000 | 식음료 : 050-222-0000 <br/>
						연습장 : 000-111-0000 스키장&콘도 : 000-111-2222 <br /> <a href="#">[업장 전화안내
							바로가기]</a><br /> 업장 주소 : OO시 OO구 OO면 대로2222번길 66(OO면 O리 산OO-1번지)<br />
						스키장/콘도 주소 : OO시 OO면 OO로 111(OO면 OO리 산44-3번지)
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
					<h4>Messenger </h4>
					<ul class="plain">
						<li><a href="https://twitter.com/"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="https://www.facebook.com/"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="https://www.instagram.com/"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="https://github.com/"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">
				&copy; Sunshine Village 
			</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>
