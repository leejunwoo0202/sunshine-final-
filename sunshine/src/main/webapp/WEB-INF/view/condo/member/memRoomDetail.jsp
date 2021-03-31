<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../../include/include.jsp"%>
<%@ page import="sunshine.model.DTO.MemberDTO" %>
<!DOCTYPE HTML>
<!--객실 리스트-->
<html>
<head>
<meta charset="UTF-8">
<title>Industrious by TEMPLATED</title>


<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../../assets/css/main.css" />
<link rel="stylesheet" href="../../assets/css/imgSlider.css" />

</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Industrious</a>
		<nav>
			<a href="#menu">Menu</a>
		</nav>
	</header>




	<!--  메뉴 -->


	<!-- Nav -->
	<nav id="menu">
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/signUp">회원가입</a></li>
			<li><a href="generic.html">Generic</a></li>
			<li><a href="/member/login.do">로그인</a>
			<li><a href="/condo/condoMain">콘도</a>
			<li><a href="#">레스토랑</a>
			<li><a href="#">프렌즈샵</a>
			<li><a href="#">리프트권</a>
		</ul>
	</nav>



	<!--  메뉴 -->



	<!-- Banner -->
	<section id="banner">
		<div class="inner">
			<h1>SunShine</h1>
			<p>
				A responsive business oriented template with a video background<br />
				designed by <a href="https://templated.co/">TEMPLATED</a> and
				released under the Creative Commons License.
			</p>
		</div>
		<video autoplay loop muted playsinline src="../../images/banner.mp4"></video>
	</section>

	<!-- Highlights -->

	<section class="wrapper">
		<div class="inner">
			<header class="special">
				<h2>객실 상세</h2>
						
<!-- 						<div> 버튼 클릭시 이미지 변경  -->
<!-- 						<img alt="img" src="../../images/left_btn.png" /> -->
<!-- 						<img alt="img" src="../../images/right_btn.png" /> -->
<!-- 						</div> -->
	
			</header>
			<div class="highlights">
<!-- 				<section> -->
				
				
				
				
					<form action="../memBooking/${list.get(0).roomNum}" method="post">
				
						<table border="1" >
					
							<tr>
								<td> 타입</td>
								<td>선샤인 콘도</td>
								<td> 이용 요금</td>
								<td>상세 </td>
								<td></td>
							
								
							</tr>

							<c:forEach var="room" items="${list}" >
							
							
							<input type="hidden" value="${room.roomNum}"/>			
							<input type="hidden" value="${room.roomType}"/>			
							<input type="hidden" value="${room.roomPrice}"/>	

<%-- 							<c:if test="${loginInfo.grade eq 'em'}" > --%>
<!-- 							직원 -->
<%-- 							</c:if> --%>
<%-- 							<c:if test="${loginInfo.grade eq 'mem' }"> --%>
<!-- 							회원 -->
<%-- 							</c:if> --%>

							<input type ="hidden" value="${user.memNo}"/>
							<input type ="hidden" value="${user.userId}"/>
							<input type ="hidden" value="${user.name}"/>
							<input type ="hidden" value="${user.email}"/>
							<input type ="hidden" value="${user.phone}"/>
						
								<tr>
									<td><c:if test="${room.roomType == 'DR' }">
										Double Room
									</c:if> <c:if test="${room.roomType == 'TR' }">
										Twin Room
									</c:if> <c:if test="${room.roomType == 'FR' }">
										Family Room
									</c:if> <c:if test="${room.roomType == 'CR' }">
										Connecting Room
									</c:if></td>
									
								<td>					
								<div class="imgBannerWrap">
										<c:forEach items="${list }" var="room">
												<c:forTokens items="${room.roomImage }" delims="`" var="img" varStatus="status" > 
					<!-- 											객실이미지 -->
													<img class="imgSlide" src="/condo/upload/${img }" alt="객실 사진" style="width:700px; height:500px"/>
<!-- 													<a href="hotel" class="imgSlide" -->
<%-- 														style="background-image: url('/condo/upload/${img }'); width:700px; height:500px" --%>
<!-- 													> -->
					<!-- 												<p class="textArea">21321312321</p> -->
					<!-- 												<p class="textArea-field">sadasdasdasd</p> -->
													</a>
												</c:forTokens>
					
													<!-- 이미지 슬라이드 버튼 -->
													<div class="imageSlider">
														<a class="prev" onclick="button_click(-1);">&#10094</a>
														<a class="next" onclick="button_click(1);">&#10095</a>
													</div>
										<td><fmt:formatNumber value="${room.roomPrice}" pattern="#,###" />원</td> 
										<td>${room.roomDetail}</td>
										</c:forEach>
								</div>						
							</c:forEach>
							
							
							
							
						</table>
						<div class="button-book" >
							<a href="../memList"><input type="button" value="리스트 " ></a>
							<input type="submit" value="예약" style="float: right;"/>						
						</div>
						</form>
						
<!-- 				</section> -->
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
				<h2>Faucibus consequat lorem</h2>
				<p>In arcu accumsan arcu adipiscing accumsan orci ac. Felis id
					enim aliquet. Accumsan ac integer lobortis commodo ornare aliquet
					accumsan erat tempus amet porttitor.</p>
			</header>
			<div class="testimonials">
				<section>
					<div class="content">
						<blockquote>
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../../images/pic01.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>Jane Doe</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../../images/pic03.jpg" alt="" />
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
							<p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum
								adipiscing gravida odio porttitor sem non mi integer non
								faucibus.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="../../images/pic02.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>Janet Smith</strong> <span>CEO - ABC Inc.</span>
							</p>
						</div>
					</div>
				</section>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Accumsan montes viverra</h3>
					<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
						gravida odio porttitor sem non mi integer non faucibus ornare mi
						ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
						lorem accumsan varius montes viverra nibh in adipiscing. Lorem
						ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum.
						Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed
						feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia
						ante nunc ac gravida.</p>
				</section>
				<section>
					<h4>Sem turpis amet semper</h4>
					<ul class="alt">
						<li><a href="#">Dolor pulvinar sed etiam.</a></li>
						<li><a href="#">Etiam vel lorem sed amet.</a></li>
						<li><a href="#">Felis enim feugiat viverra.</a></li>
						<li><a href="#">Dolor pulvinar magna etiam.</a></li>
					</ul>
				</section>
				<section>
					<h4>Magna sed ipsum</h4>
					<ul class="plain">
						<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">
				&copy; Untitled. Photos <a href="https://unsplash.co">Unsplash</a>,
				Video <a href="https://coverr.co">Coverr</a>.
			</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="../../assets/js/jquery.min.js"></script>
	<script src="../../assets/js/browser.min.js"></script>
	<script src="../../assets/js/breakpoints.min.js"></script>
	<script src="../../assets/js/util.js"></script>
	<script src="../../assets/js/main.js"></script>

	<script type="text/javascript">
		var currSlide = 1;
		showSlide(currSlide);
	
		function button_click(num) {
		  // 버튼 클릭
		  showSlide((currSlide += num));
		}
	
		function showSlide(num) {
		  // 이미지 변경
		  const slides = document.querySelectorAll(".imgSlide");
		  if(num < 1) {
		    currSlide = 1;
		  }
		  if(num > slides.length) {
		    currSlide = slides.length;
		  }
		  for(var i=0; i < slides.length ; i++) {
		    slides[i].style.display = "none";
		  } 
		  slides[currSlide - 1].style.display = "block";
		}
	
	
	
		function roomPwCk(){
			if(document.getElementById('roomPw').value.trim() == ""){
				alert("비밀번호를 입력하세요");
				document.getElementById('roomPw').focus();
				return false
			}
		}
		function roomDel(){
			if(confirm('객실을 삭제하시겠습니까?')){
				if(document.getElementById('roomPw').value.trim() == ""){
					alert("비밀번호를 입력하세요");
					document.getElementById('roomPw').focus();
					return false
				}else{
					 document.frm.action = "/condo/roomDel";
				     frm.submit();
				}
			}
		}
			
	</script>
</body>
</html>